package entities;

public class User {
    private String ime;
    private String email;
    private String adresa;
    private String novo;

    public User(String ime, String email, String adresa){
        this.ime = ime;
        this.email = email;
        this.adresa = adresa;
    }

    public String getIme(){
        return ime;
    }

    public String getEmail(){
        return email;
    }

    public String getAdresa(){
        return adresa;
    }

}
