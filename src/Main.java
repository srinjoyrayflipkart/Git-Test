import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerService;


public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        // Create customers
        Customer customer1 = new Customer();
        customer1.setCustomerID(1);
        customer1.setCustomerName("Amit");
        customer1.setCustomerAddress("10 MG Rd");
        customerService.createCustomer(customer1);

        Customer customer2 = new Customer();
        customer2.setCustomerID(2);
        customer2.setCustomerName("Anil");
        customer2.setCustomerAddress("20 MG Rd");
        customerService.createCustomer(customer2);

        // List all customers
        customerService.listCustomers();

        // Update a customer
        Customer updatedCustomer = new Customer();
        updatedCustomer.setCustomerID(1);
        updatedCustomer.setCustomerName("Updated Name");
        updatedCustomer.setCustomerAddress("Updated Address");
        customerService.updateCustomer(updatedCustomer);

        // List all customers after update
        customerService.listCustomers();

        // Delete a customer
        customerService.deleteCustomer(2);

        // List all customers after delete
        customerService.listCustomers();
    }
}