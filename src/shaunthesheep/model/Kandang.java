package model;

import java.util.ArrayList;

public class Kandang 
{
    public static int jumlahKandang = 0;
    private String noKandang;
    private String jenisKandang;
    private int kapasitas;
    private int isi;
    private ArrayList<PengurusTernak> paraPengurusTernak;
    private ArrayList<Kamar> kamarKamar;
    
    public Kandang(String jenisKandang, int kapasitas) {
        this.noKandang = generateNoKandangByJenis(jenisKandang);
        this.jenisKandang = jenisKandang;
        this.kapasitas = kapasitas;
        this.isi = 0;
        this.kamarKamar = new ArrayList<>();

        for (int i = 0; i < kapasitas; i++) {
            kamarKamar.add(new Kamar());
        }
        Kamar.jumlahKamar = 0;
    }

    public void getInfo() {
        System.out.println("nomor       : " + this.noKandang);
        System.out.println("jenis       : " + this.jenisKandang);
        System.out.println("kapasitas   : " + this.kapasitas);
        System.out.println("List kamar:");
        for (Kamar kamar : kamarKamar) {
            System.out.println("no. kamar -> " + kamar.getNoKamar());
        }
        System.out.println();
    }
    
    public String generateNoKandangByJenis(String jenis) 
    {
        String lowerJenis = jenis.toLowerCase();

        if (lowerJenis.equals("sapi")) {
            return "1" + generateNoKandang();
        } else if (lowerJenis.equals("kambing")) {
            return "2" + generateNoKandang();
        } else if (lowerJenis.equals("domba")) {
            return "3" + generateNoKandang();
        } else {
            throw new IllegalArgumentException("Jenis hewan ternak tidak valid: " + jenis);
        }
    }
    
    public String generateNoKandang() {
        jumlahKandang++;
        String id = String.format("%02d", jumlahKandang);
        return id;
    }

    public void cekKamarKosong() {
        for (Kamar kamar : kamarKamar) {
            if (kamar.isStatusIsi() == false) {
                System.out.println("kamar '" + kamar.getNoKamar() + "' masih kosong");
            }
        }
    }

    public Kamar cariKamarKosong() {
        for (Kamar kamar : kamarKamar) {
            if (kamar.isStatusIsi() == false) {
                return kamar;
            }
        }
        return null;
    }
    
    public void isiKamar(Animal animal) {
        while (this.kapasitas != this.isi && this.jenisKandang.equals(animal.getJenis())) {
            cariKamarKosong().setAnimal(animal);
        }

        throw new IllegalStateException("Kamar di kandang '" + this.noKandang + "' sudah penuh :)");
    }
    
    
    /* GETTER AND SETTER */
    public static int getJumlahKandang() {
        return jumlahKandang;
    }

    public static void setJumlahKandang(int jumlahKandang) {
        Kandang.jumlahKandang = jumlahKandang;
    }

    public String getNoKandang() {
        return noKandang;
    }

    public void setNoKandang(String noKandang) {
        this.noKandang = noKandang;
    }

    public String getJenisKandang() {
        return jenisKandang;
    }

    public void setJenisKandang(String jenisKandang) {
        this.jenisKandang = jenisKandang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getIsi() {
        return isi;
    }

    public void setIsi(int isi) {
        this.isi = isi;
    } 
}
