package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;  

public class Domba implements Animal 
{
    private static int counter = 0;
    private String kode;
    private String jenis;
    private LocalDateTime tanggalDaftar;
    private String asal;
    private int berat;
    private int usia;
    private String noKamar;
    private boolean statusTerjual;
    private boolean statusKesehatan;
    private boolean statusVaksin;
    private boolean statusMakan;

    public Domba(LocalDateTime tanggalDaftar, String asal, int berat) {
        this.kode = generateKode();
        this.jenis = "Domba";
        this.tanggalDaftar = tanggalDaftar;
        this.usia = hitungUsia(tanggalDaftar);
        this.asal = asal;
        this.berat = berat;
        this.noKamar = null;
        this.statusTerjual = false;
        this.statusKesehatan = false;
        this.statusVaksin = false;
        this.statusMakan = false;
    }

    @Override
    public void getInfo() {
        // TODO Auto-generated method stub
        System.out.println("kode            : " + this.kode);
        System.out.println("jenis           : " + this.jenis);
        System.out.println("tanggal daftar  : "+ tanggalDaftarToString(tanggalDaftar));
        System.out.println("usia            : " + this.usia + " hari");
        System.out.println("berat           : " + this.berat + "kg");
        System.out.println("asal            : "+ this.asal);
        System.out.println("statusTerjual   : "+ this.statusTerjual);
        System.out.println("statusKesehatan : "+ this.statusKesehatan);
        System.out.println("statusVaksin    : "+ this.statusVaksin);
        System.out.println("statusMakan     : " + this.statusMakan);
        System.out.println();
    }

    @Override
    public int hitungUsia(LocalDateTime tanggalDaftar) {
        // TODO Auto-generated method stub
        LocalDateTime now = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(tanggalDaftar, now);
        return (int) days;
    }

    @Override
    public String generateKode() {
        // TODO Auto-generated method stub
        counter++;
        String id = "3" + String.format("%03d", counter);
        return id;
    }    

    public String tanggalDaftarToString(LocalDateTime tanggalDaftar) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateTime = tanggalDaftar.format(format);
        return formatDateTime;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Domba.counter = counter;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public void setNoKamar(String nomor) {
        // TODO Auto-generated method stub
        this.noKamar = nomor;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
