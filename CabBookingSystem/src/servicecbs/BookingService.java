package servicecbs;


import model.copy.Booking;
import model.copy.Cab;
import model.copy.Customer;
import model.copy.Driver;
import java.util.*;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();
    private int bookingCounter = 1;

    public Booking createBooking(Customer customer, Cab cab, Driver driver) {
        if (cab == null || driver == null) {
            System.out.println("No cab/driver available for booking.");
            return null;
        }
        cab.setAvailable(false);
        driver.setAvailable(false);
        Booking booking = new Booking(bookingCounter++, customer, cab, driver);
        bookings.add(booking);
        System.out.println("Booking Successful: " + booking);
        return booking;
    }

    public void showBookings() { bookings.forEach(System.out::println); }
}
