package shaunthesheep;

import java.time.LocalDateTime;
import model.Kandang;
import model.Pemilik;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        // Animal sapi1 = new Sapi(LocalDateTime.of(2022, 5, 20, 0, 0, 0), "breeding", 50);
        // Animal kambing1 = new Kambing(LocalDateTime.of(2022, 5, 20, 0, 0, 0), "breeding", 50);
        // Animal domba1 = new Domba(LocalDateTime.of(2022, 5, 20, 0, 0, 0), "breeding", 50);

        Pemilik saya = new Pemilik();

        Kandang sapi_A = new Kandang("sapi", 13);
        Kandang sapi_B = new Kandang("sapi", 3);
        Kandang kambing_A = new Kandang("kambing", 4);
        Kandang domba_A = new Kandang("domba", 5);

        saya.tambahKandang(sapi_A);
        saya.tambahKandang(sapi_B);
        saya.tambahKandang(kambing_A);
        saya.tambahKandang(domba_A);

        saya.beliSapi(50);
        saya.beliSapi(50);
        saya.beliSapi(50);
        saya.beliDomba(50);
        saya.beliDomba(50);
        saya.beliKambing(10);
        saya.beliKambing(50);
        
        // AnimalFactory animalFactory = new AnimalFactory();        
        // Animal sapi_1 = animalFactory.addFromBreeding("sapi", 50);
        // Animal sapi_2 = animalFactory.addFromBuying("sapi", 70);


        // Animal kambing_1 = animalFactory.addFromBreeding("kambing", 22);
        // Animal kambing_2 = animalFactory.addFromBuying("kambing", 12);
        
        // Animal domba_1 = animalFactory.addFromBreeding("domba", 55);
        // Animal domba_2 = animalFactory.addFromBuying("domba", 34);
        
        saya.summaryHewan();
        // saya.infoSapi("1003");
        // saya.infoKambing("2001");
        // saya.infoDomba("3002");

        saya.kandangYangAdaKosongnya();
        // saya.infoKandangKosong();

        // sapi_A.getInfo();
        // sapi_B.getInfo();
        // kambing_A.getInfo();
        // domba_A.getInfo();


        // sapi_1.getInfo();
        // sapi_2.getInfo();
        // kambing_1.getInfo();
        // kambing_2.getInfo();
        // domba_1.getInfo();
        // domba_2.getInfo();

    }
}
