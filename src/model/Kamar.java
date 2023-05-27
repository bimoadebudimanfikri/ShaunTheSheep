package model;

public class Kamar 
{
    public static int jumlahKamar = 0;
    private String noKamar;
    private Animal animal;
    private boolean statusIsi;
    
    public Kamar() {
        this.noKamar = generateNoKamar();
        this.animal = null;
        this.statusIsi = false;
    };

    public Kamar(Animal animal, boolean statusIsi) {
        this.noKamar = generateNoKamar();
        this.animal = animal;
        this.statusIsi = false;
    }

    private String generateNoKamar() {
        jumlahKamar++;
        String id = String.format("%02d", jumlahKamar);
        return id;
    }

    /* SETTER AND GETTER */
    public String getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
        this.statusIsi = true;
        animal.setNoKamar(this.noKamar);
    }

    public boolean isStatusIsi() {
        return statusIsi;
    }
    
}
