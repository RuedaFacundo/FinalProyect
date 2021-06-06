package com.company;

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
/// metodo agregar reserva
}
