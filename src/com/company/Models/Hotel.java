package com.company.Models;

import com.company.Enum.AvailableRoom;

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
        boolean exists = false;
        for (Admin administrator : adminList) {
            if (administrator.getDni().equals(admin.getDni())) {
                System.out.println("El administrador ya esta cargado");
                exists = true;
            }
        }
        if(!exists){
            adminList.add(admin);
        }
    }

    public void addGuest(Guest guest) {
        boolean exists = false;
        for (Guest customer : guestList) {
            if (customer.getDni().equals(guest.getDni())) {
                exists = true;
                System.out.println("El cliente ya esta cargado en el sistema");
            }
        }
        if(!exists){
            guestList.add(guest);
        }
    }

    public void addRecepcionist(Receptionist receptionist) {
        boolean exists = false;
        for (Receptionist recep : receptionistList) {
            if (recep.getDni().equals(receptionist.getDni())) {
                exists = true;
                System.out.println("El recepcionista ya esta cargado");
            }
        }
        if(!exists){
            receptionistList.add(receptionist);
        }
    }

    public void addRoom(Room room) {
        boolean exists = false;
        for (Room roomNro : roomList) {
            if (roomNro.getRoomNumber() == room.getRoomNumber()) {
                exists = true;
                System.out.println("El numero de habitacion ya esta cargado");
            }
        }
        if(!exists){
            roomList.add(room);
        }
    }

    public void addBooking(Booking booking) {
        boolean exists = false;
        if(booking.getAvailable() == AvailableRoom.AVAILABLE){
            for (Booking b : bookingList) {
                if ((b.getRoomNumber() == booking.getRoomNumber()) && (b.getCheckInDate() != booking.getCheckInDate())){
                    exists = true;
                }
            }
        }
        if(!exists){
            bookingList.add(booking);
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }

    public void showGuestList() {
        for (Guest guest : guestList) {
            System.out.println(guest);
        }
    }

    public void showGuest(Guest customer) {
        for (Guest guest : guestList) {
            if(customer.getDni().equals(guest.getDni())){
                System.out.println(guest);
            }
        }
    }

    public void showAdminList() {
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
    }

    public void showAdmin(Admin administrator) {
        for (Admin admin : adminList) {
            if(admin.getDni().equals(administrator.getDni())){
                System.out.println(admin);
            }
        }
    }

    public void showReceptionistList() {
        for (Receptionist receptionist : receptionistList) {
            System.out.println(receptionist);
        }
    }

    public void showReceptionist(Receptionist recep) {
        for (Receptionist receptionist : receptionistList) {
            if(receptionist.getDni().equals(recep.getDni())){
                System.out.println(receptionist);
            }
        }
    }

    public void showBookingList() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public void showBookingDay(Booking bookingDay) {
        for (Booking booking : bookingList) {
            if(booking.getCheckInDate().compareTo(bookingDay.getCheckInDate()) == 0){
                System.out.println(booking);
            }
        }
    }

    public void showRoomAvailable(AvailableRoom available) {
        for (Room room : roomList) {
            if(available.equals(room.getAvailable())){
                System.out.println(room);
            }
        }
    }

    public void showRoomOccupied() {
        for (Room room : roomList) {
            if(room.isOccupiedRoom()){
                System.out.println(room);
            }
        }
    }

    public void showPaymentList() {
        for (Payment payment : paymentList) {
            System.out.println(payment);
        }
    }

}