package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  

public interface Animal 
{
    // protected String kode;
    // protected String jenis;
    // protected LocalDateTime tanggalDaftar;
    // protected String asal;
    // protected int berat;
    // protected int usia;
    // protected boolean statusTerjual;
    // protected boolean statusKesehatan;
    // protected boolean statusVaksin;
    // protected boolean statusMakan;

    void setNoKamar(String nomor);
    String getJenis();
    void getInfo();
    String generateKode();
    int hitungUsia(LocalDateTime tanggalDatar);
}
