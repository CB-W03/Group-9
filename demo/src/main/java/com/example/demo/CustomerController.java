package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class CustomerController {
    
    @Autowired
    CustomerRepo repo;

    @Autowired
    TransactionRepo trRepo;

    @Autowired
    CardRepo caRepo;

    @GetMapping("/{id}")
    public Customer getCustomerByID(@PathVariable int id){
        return repo.findById(id).get();     
    }

    @GetMapping("/CustomerList")
    public List<Customer> getCustomerList(){
        return repo.findAll();
    }

    @GetMapping("/{id}/transactions")
    public List<Transaction> getCustomerTransactions(@PathVariable int id){
        return trRepo.findByCustomerID(id);
    }

    @GetMapping("/{id}/cards")
    public List<Card> getCustomerCard(@PathVariable int id){
        return caRepo.findByCustid(id);
    }

}
