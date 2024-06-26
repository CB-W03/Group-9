package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    private int custid;

    private String name;

    public Customer() {

    }

    public Customer(int custid, String name) {
        this.custid = custid;
        this.name = name;
    }

    public int getCustId() {
        return custid;
    }

    public String getName() {
        return name;
    }

    public void setCustId(int custid) {
        this.custid = custid;
    }

    public void setName(String name) {
        this.name = name;
    }

}
