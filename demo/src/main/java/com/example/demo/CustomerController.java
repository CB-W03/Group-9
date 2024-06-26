package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
    @Autowired
    CustomerRepo repo;

    @GetMapping("/customers/{id}")
    public Customer getDefaultCustomer(@PathVariable int id) {
        Optional<Customer> maybeCust = repo.findById(id);
        if (maybeCust.isPresent()) {
            return maybeCust.get();
        }
        return new Customer(-1, "Customer not found");
    }

    @GetMapping("/customers")
    public Customer getDefaultCustomer() {
        return new Customer(-1, "Default");
    }
}
