package entities;

public abstract class Person {
    protected int id;
    protected String ime;
    protected int dob;

    public Person(int id, String ime, int dob){
        this.id = id;
        this.ime = ime;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public int getDob() {
        return dob;
    }

    @Override
    public String toString(){
        return ime + " (" + dob + " godina)";
    }
}
