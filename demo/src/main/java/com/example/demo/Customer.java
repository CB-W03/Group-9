package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    private int custid;

    private String name;

    private boolean accountBlocked;

    public Customer() {

    }

    public Customer(int custid, String name,boolean accountBlocked) {
        this.custid = custid;
        this.name = name;
        this.accountBlocked=accountBlocked;
    }

    public int getCustId() {
        return custid;
    }

    public String getName() {
        return name;
    }

    public boolean getBlockedStatus() {
        return accountBlocked;
    }

    public void setBlockedStatus(boolean accountBlocked){
        this.accountBlocked=accountBlocked;
    }

    public void setCustId(int custid) {
        this.custid = custid;
    }

    public void setName(String name) {
        this.name = name;
    }

}
