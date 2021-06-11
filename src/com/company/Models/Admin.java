package com.company.Models;

import com.google.gson.Gson;
import java.io.File;
import java.io.*;

public class Admin extends User implements Serializable {


    public Admin (){
        super();
    }

    public Admin (String name, String key, String dni, String phone, String email){
        super(name, key, dni, phone, email);
    }

    File file = new File("C:/Users/facun/OneDrive/Desktop/Programacion3/Proyecto Final - Gestion de Reservas/src/com/company/File/admin.json");


    public void writeFile (Admin admin)  {
        if(file.exists()){
            System.out.println("El archivo existe");
            Gson gson = new Gson();
            try{
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                gson.toJson(admin, Admin.class, bufferedWriter);
            } catch (IOException e){
                System.out.println("El archivo no se pudo escribir" + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe");
        }

    }

    public void readFile () {
        Gson gson = new Gson();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Admin admin = gson.fromJson(bufferedReader, Admin.class);
            System.out.println(admin);
        } catch (IOException e){
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
    }

}
