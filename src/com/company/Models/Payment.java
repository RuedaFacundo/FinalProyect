package com.company.Models;

public class Payment {

    private long days;
    private float price;
    private Guest guest;

    public Payment (){}

    public Payment (long days, float price, Guest guest){
        this.days = days;
        this.price = price;
        this.guest = guest;
    }

    public float totalPrice (){
        return days * price;
    }


}
