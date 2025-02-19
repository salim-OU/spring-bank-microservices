package net.bankapp.account.service;

import net.bankapp.account.entity.Customer;
import java.util.List;

public interface CustomerService {
    /**
     * Create a new customer
     */
    Customer createCustomer(Customer customer);

    /**
     * Get customer by ID
     */
    Customer getCustomerById(int customerId);

    /**
     * Get all customers
     */
    List<Customer> getAllCustomers();

    /**
     * Update existing customer
     */
    Customer updateCustomer(int customerId, Customer customer);

    /**
     * Delete customer by ID
     */
    void deleteCustomer(int customerId);
}