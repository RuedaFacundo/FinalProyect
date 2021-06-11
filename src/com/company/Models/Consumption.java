package com.company.Models;

import com.company.Enum.ConsumptionType;
import com.google.gson.Gson;

import java.io.*;

public class Consumption {

    ConsumptionType type;
    private int amount;

    public Consumption (){
    }

    public Consumption (ConsumptionType type, int amount){
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Consumo: " + this.type.getName() + "\n" + "Precio: " + this.type.getPrice() + "\n" + "Cantidad: " + this.amount + "\n" + "Total: " + (this.type.getPrice() * this.amount) + "\n";
    }
}
