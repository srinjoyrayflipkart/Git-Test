package com.flipkart.business;

import com.flipkart.bean.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customerList;

    public CustomerService() {
        this.customerList = new ArrayList<>();
    }

    public void createCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer is created --> " + customer.toString());
    }

    public boolean deleteCustomer(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerID() == customerId) {
                customerList.remove(customer);
                System.out.println("Customer is deleted with ID --> " + customerId);
                return true;
            }
        }
        System.out.println("Customer not found with ID --> " + customerId);
        return false;
    }

    public boolean updateCustomer(Customer updatedCustomer) {
        for (Customer customer : customerList) {
            if (customer.getCustomerID() == updatedCustomer.getCustomerID()) {
                // Update customer details
                customer.setCustomerName(updatedCustomer.getCustomerName());
                customer.setCustomerAddress(updatedCustomer.getCustomerAddress());
                System.out.println("Customer is updated --> " + updatedCustomer);
                return true;
            }
        }
        System.out.println("Customer not found with ID --> " + updatedCustomer.getCustomerID());
        return false;
    }

    public void listCustomers() {
        System.out.println("All customers displayed -->");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }
}
