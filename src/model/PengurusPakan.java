package model;

import java.util.ArrayList;

public class PengurusPakan extends Orang implements Observable
{
    private Kandang kandang;
    private ArrayList<Animal> animals;

    public PengurusPakan(Kandang kandang) {
        this.kandang = kandang;
    }

    @Override
    public void beriPakan(Kandang kandang) {
        // TODO Auto-generated method stub

    }

    /* GETTER AND SETTER */
    public Kandang getKandang() {
        return kandang;
    }

    public void setKandang(Kandang kandang) {
        this.kandang = kandang;
    }

}
