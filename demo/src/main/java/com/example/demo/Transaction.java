package com.example.demo;

public class Transaction {
    private String transactionID;
    
    private double amount;

    private String date;

    private String customerID;

    private String thirdPartyID;

    public Transaction(String transactionID, double amount, String date, String customerID, String thirdPartyID){
        this.transactionID = transactionID;
        this.amount = amount;
        this.date = date;
        this.customerID = customerID;
        this.thirdPartyID = thirdPartyID;
    }

    public String getID(){ return this.transactionID; }
    public double getAmount(){ return this.amount; }
    public String getDate(){ return this.date; }
    public String getRecipient(){ return this.customerID; }
    public String getThirdPartyID(){ return this.thirdPartyID; }

    public void setID(String id){
        this.transactionID = id;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setRecipient(String customerID){
        this.customerID = customerID;
    }
    public void setThirdParty(String thirdPartyID){
        this.thirdPartyID = thirdPartyID;
    }
}
