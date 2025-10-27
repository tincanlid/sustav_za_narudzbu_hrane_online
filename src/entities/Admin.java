package entities;

public class Admin extends Person {
    private String rank;

    public Admin(int id, String ime, int dob, String rank){
        super(id, ime ,dob);
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Admin: " + super.toString() + ", rank=" + rank;
    }
}
