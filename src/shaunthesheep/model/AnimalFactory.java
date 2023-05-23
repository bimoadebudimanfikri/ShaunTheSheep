package model;

import java.time.LocalDateTime;

public class AnimalFactory 
{    
    public static Animal addFromBreeding(String jenis, int berat) 
    {
        String lowerJenis = jenis.toLowerCase();

        if (lowerJenis.equals("sapi")) {
            return new Sapi(LocalDateTime.now(), "breeding", berat);
        } else if(lowerJenis.equals("kambing")){
            return new Kambing(LocalDateTime.now(), "breeding", berat);
        } else if(lowerJenis.equals("domba")){
            return new Domba(LocalDateTime.now(), "breeding", berat);
        } else {
            throw new IllegalArgumentException("Jenis hewan ternak tidak valid: " + jenis);
        }
    };
    
    public static Animal addFromBuying(String jenis, int berat) 
    {
        String lowerJenis = jenis.toLowerCase();

        if (lowerJenis.equals("sapi")) {
            return new Sapi(LocalDateTime.now(), "pembelian", berat);
        } else if(lowerJenis.equals("kambing")){
            return new Kambing(LocalDateTime.now(), "pembelian", berat);
        } else if (lowerJenis.equals("domba")) {
            return new Domba(LocalDateTime.now(), "pembelian", berat);
        } else {
            throw new IllegalArgumentException("Jenis hewan ternak tidak valid: " + jenis);
        }
    };
}
