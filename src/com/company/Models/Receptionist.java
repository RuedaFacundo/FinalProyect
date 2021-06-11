package com.company.Models;

import com.company.Enum.RoomType;
import com.company.Interfaz.Check;
import com.google.gson.Gson;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

import static com.company.Enum.RoomType.DOUBLE;
import static com.company.Enum.RoomType.SIMPLE;
import static java.time.temporal.ChronoUnit.DAYS;

public class Receptionist extends User implements Check {

    public Receptionist (){
        super();
    }

    public Receptionist (String name, String key, String dni, String phone, String email){
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
