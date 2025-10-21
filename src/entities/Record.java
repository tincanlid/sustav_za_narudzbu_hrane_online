package entities;

public class Record {
    private User user;
    private Item item;
    private Booking booking;

    public Record(User user, Item item, Booking booking){
        this.user = user;
        this.item = item;
        this.booking = booking;
    }

    public User getUser(){
        return user;
    }

    public Item getItem(){
        return item;
    }

    public Booking getBooking(){
        return booking;
    }
}
