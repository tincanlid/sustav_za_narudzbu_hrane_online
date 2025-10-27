package entities;

public record Record (User user, Item item, Booking booking) implements Trackable {
    @Override
    public void track(){
        System.out.println("Tracking order: " + user.getIme() + ": " + item.getNaziv());
    }

    @Override
    public String toString(){
        return "Record(user=" + user.getIme() + ", item= " + item.getNaziv() + ", booking= " + booking.getDate() + ")";
    }
}
