package model.copy;



public class Booking {
    private int bookingId;
    private Customer customer;
    private Cab cab;
    private Driver driver;

    public Booking(int bookingId, Customer customer, Cab cab, Driver driver) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.cab = cab;
        this.driver = driver;
    }

    public int getBookingId() { return bookingId; }
    public Customer getCustomer() { return customer; }
    public Cab getCab() { return cab; }
    public Driver getDriver() { return driver; }

    @Override
    public String toString() {
        return "Booking{" +
                "ID=" + bookingId +
                ", Customer=" + customer.getName() +
                ", Cab=" + cab.getCabNumber() +
                ", Driver=" + driver.getName() +
                '}';
    }
}
