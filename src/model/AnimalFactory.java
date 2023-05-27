package model;

import java.time.LocalDateTime;

public class AnimalFactory 
{    
    public static Animal addFromBreeding(String jenis, String JK, int berat) 
    {
        String lowerJenis = jenis.toLowerCase();

        if (lowerJenis.equals("sapi")) {
            return new Sapi(LocalDateTime.now(), JK, "breeding", berat);
        } else if(lowerJenis.equals("kambing")){
            return new Kambing(LocalDateTime.now(), JK, "breeding", berat);
        } else if(lowerJenis.equals("domba")){
            return new Domba(LocalDateTime.now(), JK, "breeding", berat);
        } else {
            throw new IllegalArgumentException("Jenis hewan ternak tidak valid: " + jenis);
        }
    };
    
    public static Animal addFromBuying(String jenis, String JK, int berat) 
    {
        String lowerJenis = jenis.toLowerCase();

        if (lowerJenis.equals("sapi")) {
            return new Sapi(LocalDateTime.now(), JK, "pembelian", berat);
        } else if(lowerJenis.equals("kambing")){
            return new Kambing(LocalDateTime.now(), JK, "pembelian", berat);
        } else if (lowerJenis.equals("domba")) {
            return new Domba(LocalDateTime.now(), JK, "pembelian", berat);
        } else {
            throw new IllegalArgumentException("Jenis hewan ternak tidak valid: " + jenis);
        }
    };
}
