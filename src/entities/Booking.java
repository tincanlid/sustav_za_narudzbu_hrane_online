package entities;

public class Booking implements Reservable{
    private int bookingId;
    private String date;

    public Booking(int BookingId, String date){
        this.bookingId = BookingId;
        this.date = date;
    }

    public int getBookingId(){
        return bookingId;
    }

    public String getDate(){
        return date;
    }

    @Override
    public void reserve(){
        System.out.println("Booking #" + bookingId + " reserved za " + date);
    }

    @Override
    public String toString(){
        return "Booking #" + bookingId + " (" + date + ")";
    }
}
