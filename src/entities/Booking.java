package entities;

public class Booking {
    private User user;
    private String restoran;
    private String datum;

    public Booking(User user, String restoran, String datum){
        this.user = user;
        this.restoran = restoran;
        this.datum = datum;
    }

    public User getUser(){
        return user;
    }

    public String getRestoran(){
        return restoran;
    }

    public String getDatum(){
        return datum;
    }
}
