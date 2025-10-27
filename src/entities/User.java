package entities;

public class User extends Person{
    private String email;

    public User(int id, String ime, int dob, String email){
        super(id, ime, dob);
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "User: " + super.toString() + ", email =" + email;
    }

}
