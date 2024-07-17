package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card {
    private String nameOnCard;

    @Id
    private String cardNumber;

    private String expiryDate;
    
    private String CVV;

    private int custid;

    public Card(String nameOnCard, String cardNumber, String expiryDate, String CVV, int custid){
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
        this.custid = custid;
    }

    public Card(){}

    public String getName(){ return this.nameOnCard; }
    public String getCardNumber(){ return this.cardNumber; }
    public String getExpiryDate(){ return this.expiryDate; }
    public String getCVV(){ return this.CVV; }
    private int custid(){ return this.custid; }

    public void setName(String name){ this.nameOnCard = name; }
    public void setCardNumber(String number){ this.cardNumber = number; }
    public void setExpiryDate(String date){ this.expiryDate = date; }
    public void setCVV(String CVV){ this.CVV = CVV; }
    public void setcustid(int custid){ this.custid = custid; }
}
