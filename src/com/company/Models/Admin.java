package com.company.Models;

import com.company.Enum.RoomType;
import com.company.Interfaz.Check;
import com.google.gson.Gson;
import java.time.LocalDate;
import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Admin extends User implements Serializable, Check {


    public Admin (){
        super();
    }

    public Admin (String name, String key, String dni, String phone, String email){
        super(name, key, dni, phone, email);
    }

    @Override
    public void checkIn (Booking booking, List<Payment> paymentList){
        booking.setOccupiedRoom(true);
        long days = daysBetween(booking.getCheckInDate(), booking.getCheckOutDate());
        if(booking.getType() == RoomType.SIMPLE){
            Payment pay = new Payment(days, 1500, booking.getGuest());
            paymentList.add(pay);
            System.out.println("El total pagado es: " + pay.totalPrice());
        } else if (booking.getType() == RoomType.DOUBLE) {
            Payment pay = new Payment(days, 2500, booking.getGuest());
            paymentList.add(pay);
            System.out.println("El total pagado es: " + pay.totalPrice());
        }
    }

    @Override
    public long daysBetween(LocalDate start, LocalDate end){
        return DAYS.between(start, end);
    }

    @Override
    public void checkOut (Booking booking){
        booking.setOccupiedRoom(false);
        booking.getGuest().showConsumption();
    }

    public void writeFile (Admin admin, File file)  {
        if(file.exists()){
            try{
                FileWriter fileWriter = new FileWriter(file, true);
                Gson objGson = new Gson();
                String strJson = objGson.toJson(admin);
                fileWriter.write(strJson);
                fileWriter.close();
            } catch (IOException e){
                System.out.println("El archivo no se pudo escribir" + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe");
        }

    }

    public void readFile (File file) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Gson gson = new Gson();
            Admin admin = gson.fromJson(bufferedReader, Admin.class);
            System.out.println(admin);
            bufferedReader.close();
        } catch (IOException e){
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
    }

}
