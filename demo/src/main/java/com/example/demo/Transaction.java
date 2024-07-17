package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Transaction {
    
    @Id
    private int transactionID;
    
    private double amount;

    private String date;

    
    private int customerID;

    private String thirdPartyName;


    public Transaction(){}

    public Transaction(int transactionID, double amount, String date, int customerID, String thirdPartyName){
        this.transactionID = transactionID;
        this.amount = amount;
        this.date = date;
        this.customerID = customerID;
        this.thirdPartyName = thirdPartyName;
    }

    public int getID(){ return this.transactionID; }
    public double getAmount(){ return this.amount; }
    public String getDate(){ return this.date; }
    public int getRecipient(){ return this.customerID; }
    public String getThirdPartyName(){ return this.thirdPartyName; }

    public void setID(int id){
        this.transactionID = id;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setRecipient(int customerID){
        this.customerID = customerID;
    }
    public void setThirdParty(String thirdPartyName){
        this.thirdPartyName = thirdPartyName;
    }
}
