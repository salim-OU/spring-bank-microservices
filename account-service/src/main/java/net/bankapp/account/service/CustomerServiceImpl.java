package net.bankapp.account.service;


import lombok.extern.slf4j.Slf4j;
import net.bankapp.account.dao.CustomerRepository;
import net.bankapp.account.entity.Customer;
import net.bankapp.account.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        log.info("Creating new customer");
        customer.setCreateDt(LocalDate.now());
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {
        log.info("Fetching customer with ID: {}", customerId);
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Customer not found with ID: " + customerId));
    }

    @Override
    public List<Customer> getAllCustomers() {
        log.info("Fetching all customers");
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(int customerId, Customer customer) {
        log.info("Updating customer with ID: {}", customerId);
        Customer existingCustomer = getCustomerById(customerId);
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setMobileNumber(customer.getMobileNumber());
        return customerRepository.save(existingCustomer);
    }

    @Override
    public void deleteCustomer(int customerId) {
        log.info("Deleting customer with ID: {}", customerId);
        Customer customer = getCustomerById(customerId);
        customerRepository.delete(customer);
    }
}