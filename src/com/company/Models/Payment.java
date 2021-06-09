package com.company.Models;

public class Payment {

    private int days;
    private float price;
    private Guest guest;

    public Payment (){}

    public Payment (int days, float price, Guest guest){
        this.days = days;
        this.price = price;
        this.guest = guest;
    }

    public float totalPrice (){
        return days * price;
    }


}
