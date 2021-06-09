package com.company.Models;

import com.google.gson.Gson;

import java.io.*;

public class Receptionist extends User {

    public Receptionist (){
        super();
    }

    public Receptionist (String name, String key, String dni, String phone, String email){
        super(name, key, dni, phone, email);
    }

    File file = new File("receptionist.json");

    public void writeFile (Receptionist receptionist)  {
        Gson gson = new Gson();
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            gson.toJson(receptionist, Receptionist.class, bufferedWriter);
        } catch (IOException e){
            System.out.println("El archivo no se pudo escribir" + e.getMessage());
        }
    }

    public void readFile () {
        Gson gson = new Gson();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Receptionist receptionist = gson.fromJson(bufferedReader, Receptionist.class);
            System.out.println(receptionist);
        } catch (IOException e){
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
    }

}
