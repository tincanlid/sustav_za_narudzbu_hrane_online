package entities;

public final class Item {
    private final String naziv;
    private final double cijena;

    private Item(Builder builder){
        this.naziv = builder.ime;
        this.cijena = builder.cijena;
    }

    public String getNaziv(){
        return naziv;
    }

    public double getCijena(){
        return cijena;
    }

    @Override
    public String toString(){
        return naziv + " - " + cijena + " eura";
    }

    public static class Builder {
        private String ime;
        private double cijena;

        public Builder setIme(String ime){
            this.ime = ime;
            return this;
        }

        public Builder setCijena(double cijena){
            this.cijena = cijena;
            return this;
        }

        public Item build(){
            return new Item(this);
        }
    }
}
