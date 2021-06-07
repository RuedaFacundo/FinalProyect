package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Admin> adminList = new ArrayList<>();
    private List<Receptionist> receptionistList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private List<Guest> guestList = new ArrayList<>();
    private List<Booking> bookingList = new ArrayList<>();
    private List<Payment> paymentList = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(List<Admin> adminList, List<Receptionist> receptionistList, List<Room> roomList, List<Guest> guestList, List<Booking> bookingList, List<Payment> paymentList) {
        this.adminList = adminList;
        this.receptionistList = receptionistList;
        this.roomList = roomList;
        this.guestList = guestList;
        this.bookingList = bookingList;
        this.paymentList = paymentList;
    }

    public void addAdmin(Admin admin) {
        for (Admin administrator : adminList) {
            if (administrator.getDni() != admin.getDni()) {
                adminList.add(admin);
            } else {
                System.out.println("El administrador ya esta cargado");
            }
        }
    }

    public void addGuest(Guest guest) {
        for (Guest customer : guestList) {
            if (customer.getDni() != guest.getDni()) {
                guestList.add(guest);
            } else {
                System.out.println("El cliente ya esta cargado en el sistema");
            }
        }
    }

    public void addRecepcionist(Receptionist receptionist) {
        for (Receptionist recep : receptionistList) {
            if (recep.getDni() != receptionist.getDni()) {
                receptionistList.add(receptionist);
            } else {
                System.out.println("El recepcionista ya esta cargado");
            }
        }
    }

    public void addRoom(Room room) {
        for (Room roomNro : roomList) {
            if (roomNro.getRoomNumber() != room.getRoomNumber()) {
                roomList.add(room);
            } else {
                System.out.println("El numero de habitacion ya esta cargado");
            }
        }
    }

    public void addBooking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut) {
        if (room.available == AvailableRoom.AVAILABLE) {
            Booking booking = new Booking();
            booking.setGuest(guest);
            booking.roomNumber = room.roomNumber;
            booking.setCheckInDate(checkIn);
            booking.setCheckOutDate(checkOut);
            bookingList.add(booking);
        }
    }

    public void showGuestList() {
        for (Guest guest : guestList) {
            System.out.println(guest);
        }
    }

    public void showAdminList() {
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
    }

    public void showReceptionistList() {
        for (Receptionist receptionist : receptionistList) {
            System.out.println(receptionist);
        }
    }

    public void checkIn (Room room){
        room.occupiedRoom = true;
    }

    public void checkOut (Room room){
        room.occupiedRoom = false;
    }

    public void addPayment (Payment payment){
        paymentList.add(payment);
    }

}