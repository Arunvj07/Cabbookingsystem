package cbs;

import model.copy.*;
import servicecbs.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CabService cabService = new CabService();
        BookingService bookingService = new BookingService();
        CustomerService customerService = new CustomerService();

        // Preload cabs and drivers
        cabService.addCab(new Cab(1, "Toyota", "TN01AB1234"));
        cabService.addCab(new Cab(2, "Hyundai", "TN01CD5678"));
        cabService.addCab(new Cab(3,"Benz","TN49BV9087"));
        Driver d1 = new Driver(1, "Ramesh");
        Driver d2 = new Driver(2, "Suresh");
        Driver d3 = new Driver(3, "Rocky");
        while (true) {
        	System.out.print("Welcome to Cab Booking System");
            System.out.println("\n1. Add Customer\n2. Show Customers\n3. Show Cabs\n4. Book Cab\n5. Show Bookings\n6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    customerService.addCustomer(name);
                    break;
                case 2:
                    customerService.showCustomers();
                    break;
                case 3:
                    cabService.showCabs();
                    break;
                case 4:
                    System.out.print("Enter customer ID to book: ");
                    int cid = sc.nextInt();
                    Customer customer = customerService.addCustomer("Customer" + cid);
                    Cab cab = cabService.getAvailableCab();
                    Driver driver = d1.isAvailable() ? d1 : d2.isAvailable() ? d2 : d3.isAvailable()? d3: null;
                    bookingService.createBooking(customer, cab, driver);
                    break;
                case 5:
                    bookingService.showBookings();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
               default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
