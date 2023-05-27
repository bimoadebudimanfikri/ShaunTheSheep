package model;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Pemilik extends Orang 
{
    private ArrayList<Kandang> kumpulanKandang;
    private ArrayList<Sapi> sapiSapi;
    private ArrayList<Kambing> kambingKambing;
    private ArrayList<Domba> dombaDomba;

    public Pemilik() {
        this.kumpulanKandang = new ArrayList<Kandang>();
        this.sapiSapi = new ArrayList<Sapi>();
        this.kambingKambing = new ArrayList<Kambing>();
        this.dombaDomba = new ArrayList<Domba>();
    }

    public void summaryHewan() {
        System.out.println("jumlah sapi   : " + Sapi.getCounter());
        System.out.println("jumlah kambing: " + Kambing.getCounter());
        System.out.println("jumlah domba  : " + Domba.getCounter());
        System.out.println();
    }
    
    public void tambahKandang(Kandang kandang) {
        kumpulanKandang.add(kandang);
    }

    public void beliSapi(int berat) {
//        Sapi tempSapi = (Sapi) AnimalFactory.addFromBuying("sapi", berat); 
//        sapiSapi.add(tempSapi);
        // masukkanKeKandang(tempSapi);
        // System.out.println("sapi '" + tempSapi.getKode() + "' terdaftar!");
    }

    public void beliKambing(int berat) {
//        kambingKambing.add((Kambing) AnimalFactory.addFromBuying("kambing", berat));
    }

    public void beliDomba(int berat) {
//        dombaDomba.add((Domba) AnimalFactory.addFromBuying("domba", berat));
    }
    
    public void infoSapi(String kode) 
    {
        System.out.println("Mencari detail sapi '" + kode + "' ... \n");
        for (Sapi sapi : sapiSapi) {
            if (sapi.getKode().equals(kode)) {
                sapi.getInfo();
                return;
            }
        }

        throw new NoSuchElementException("Sapi dengan kode " + kode + " tidak ditemukan");
    }
    
    public void infoKambing(String kode) 
    {
        System.out.println("Mencari detail kambing '" + kode + "' ... \n");
        for (Kambing kambing : kambingKambing) {
            if (kambing.getKode().equals(kode)) {
                kambing.getInfo();
                return;
            }
        }

        throw new NoSuchElementException("Kambing dengan kode " + kode + " tidak ditemukan");
    }
    
    public void infoDomba(String kode) 
    {
        System.out.println("Mencari detail domba '" + kode + "' ... \n");
        for (Domba domba : dombaDomba) {
            if (domba.getKode().equals(kode)) {
                domba.getInfo();
                return;
            }
        }

        throw new NoSuchElementException("Kambing dengan kode " + kode + " tidak ditemukan");
    }

    public int totalHewan(){
        return Sapi.getCounter() + Kambing.getCounter() + Domba.getCounter();
    }
    
    public int totalKandang(){
        int tmp = 0;
        for(Kandang kandang : kumpulanKandang){
            tmp = kandang.getKapasitas();
        }
        return tmp;
    }
    
    public void infoKandangKosong() 
    {
        System.out.println("Cek kamar kosong... \n");
        for (Kandang kandang : kumpulanKandang) {
            int sisa = kandang.getKapasitas() - kandang.getIsi();

            if (sisa != 0) {
                System.out.println("kandang nomor " + kandang.getNoKandang() + " masih tersisa " + sisa + " kamar");
                kandang.cekKamarKosong();
                System.out.println();
            }
        }
    }

    public Kandang kandangYangAdaKosongnya() {
        for (Kandang kandang : kumpulanKandang) {
            int sisa = kandang.getKapasitas() - kandang.getIsi();

            if (sisa != 0) {
                System.out.println("kandang " + kandang.getNoKandang() + " masih ada yang kosong nih");
                return kandang;
            }
        }
        return null;
    }
    
    public void masukkanKeKandang(Animal animal) {
        kandangYangAdaKosongnya().isiKamar(animal);
    }
}
