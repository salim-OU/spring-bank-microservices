package net.bankapp.account.web;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.account.entity.Customer;
import net.bankapp.account.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        log.info("Creating new customer");
        return new ResponseEntity<>(customerService.createCustomer(customer),
                HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int customerId) {
        log.info("Fetching customer with ID: {}", customerId);
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        log.info("Fetching all customers");
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable int customerId,
            @RequestBody Customer customer) {
        log.info("Updating customer with ID: {}", customerId);
        return ResponseEntity.ok(customerService.updateCustomer(customerId, customer));
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) {
        log.info("Deleting customer with ID: {}", customerId);
        customerService.deleteCustomer(customerId);
        return ResponseEntity.noContent().build();
    }
}