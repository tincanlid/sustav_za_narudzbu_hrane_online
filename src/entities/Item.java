package entities;

public class Item {
    private String naziv;
    private double cijena;

    public Item(String naziv, double cijena){
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public String getNaziv(){
        return naziv;
    }

    public double getCijena(){
        return cijena;
    }
}
