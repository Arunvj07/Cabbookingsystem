package servicecbs;


import model.copy.Customer;
import java.util.*;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private int customerCounter = 1;

    public Customer addCustomer(String name) {
        Customer customer = new Customer(customerCounter++, name);
        customers.add(customer);
        return customer;
    }

    public void showCustomers() { customers.forEach(System.out::println); }
}
