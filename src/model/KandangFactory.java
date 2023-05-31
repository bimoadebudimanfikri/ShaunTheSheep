package model;

import java.time.LocalDateTime;

public class KandangFactory 
{
    public static Kandang buatkandang(String jenisKandang, int kapasitas)
    {
        if(jenisKandang.equals("sapi")){
            return new Kandang("sapi",kapasitas);
        } else if(jenisKandang.equals("kambing")){
            return new Kandang("kambing",kapasitas);
        } else {
            return new Kandang("domba",kapasitas);
        }
    }
}
