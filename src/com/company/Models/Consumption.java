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

    File file = new File("consumption.json");

    public void writeFile (Consumption consumption)  {
        Gson gson = new Gson();
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            gson.toJson(consumption, Consumption.class, bufferedWriter);
        } catch (IOException e){
            System.out.println("El archivo no se pudo escribir" + e.getMessage());
        }
    }

    public void readFile () {
        Gson gson = new Gson();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Consumption consumption = gson.fromJson(bufferedReader, Consumption.class);
            System.out.println(consumption);
        } catch (IOException e){
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "Consumo: " + this.type.getName() + "\n" + "Precio: " + this.type.getPrice() + "\n" + "Cantidad: " + this.amount + "\n" + "Total: " + (this.type.getPrice() * this.amount) + "\n";
    }
}
