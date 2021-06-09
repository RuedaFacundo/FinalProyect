package com.company.Models;

import com.company.Enum.AvailableRoom;
import com.company.Enum.RoomType;
import com.google.gson.Gson;

import java.io.*;
import java.time.LocalDate;

public class Booking extends Room {

    private int bookingID;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    Guest guest;

    public Booking() {
    }

    public Booking(int roomNumber, RoomType type, AvailableRoom available, boolean occupiedRoom, int bookingID, LocalDate checkInDate, LocalDate checkOutDate, Guest guest) {
        super(roomNumber, type, available, occupiedRoom);
        this.bookingID = bookingID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guest = guest;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    File file = new File("booking.json");

    public void writeFile (Booking booking)  {
        Gson gson = new Gson();
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            gson.toJson(booking, Booking.class, bufferedWriter);
        } catch (IOException e){
            System.out.println("El archivo no se pudo escribir" + e.getMessage());
        }
    }

    public void readFile () {
        Gson gson = new Gson();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            Booking booking = gson.fromJson(bufferedReader, Booking.class);
            System.out.println(booking);
        } catch (IOException e){
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "Booking: " + super.toString() + "\n" + "Check In: " + this.checkInDate + "\n" + "Check Out: " + this.checkOutDate + "\n" + "Cliente: " + guest.toString() + "\n";
    }

}
