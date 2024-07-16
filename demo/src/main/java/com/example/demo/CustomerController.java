package com.example.demo;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class CustomerController {
    
    @Autowired
    CustomerRepo repo;

    @GetMapping("/{id}")
    public Customer getCustomerByID(@PathVariable int id){
        return repo.findById(id);
    }

    @GetMapping("/CustomerList")
    public List<Customer> getCustomerList(){
        return repo.findAll();
    }
    //comment so i can commit and push
}
