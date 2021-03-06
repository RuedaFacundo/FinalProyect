package com.company.Models;

import com.google.gson.Gson;

import java.io.*;
import java.time.LocalDate;

public class Booking extends Room {

    Room room;
    private int bookingID;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    Guest guest;

    public Booking() {
    }
    public Booking(Room room, int bookingID, LocalDate checkInDate, LocalDate checkOutDate, Guest guest) {
        super(room.roomNumber, room.type, room.available, room.occupiedRoom);
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

    @Override
    public String toString(){
        return "Booking: " + super.toString() + "\n" + "Check In: " + this.checkInDate + "\n" + "Check Out: " + this.checkOutDate + "\n" + "Cliente: " + guest.toString() + "\n";
    }

}
