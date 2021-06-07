package com.company;

public enum ConsumptionType {

    REFRESCO("Refresco", 70), CHOCOLATE("Chocolate", 120),
    ZUMO("Zumo", 50), CERVEZA("Cerveza", 150),
    SNACK("Snack", 80);

    private String name;
    private float price;

    ConsumptionType (String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

}
