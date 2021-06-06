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

    public Hotel (){
    }

    public Hotel(List<Admin> adminList, List<Receptionist> receptionistList, List<Room> roomList, List<Guest> guestList, List<Booking> bookingList) {
        this.adminList = adminList;
        this.receptionistList = receptionistList;
        this.roomList = roomList;
        this.guestList = guestList;
        this.bookingList = bookingList;
    }

    public void addAdmin(Admin admin) {
        for (Admin administrator: adminList){
            if (administrator.getDni() != admin.getDni()){
                adminList.add(admin);
            } else {
                System.out.println("El administrador ya esta cargado");
            }
        }
    }

    public void addGuest(Guest guest) {
        for (Guest customer: guestList){
            if (customer.getDni() != guest.getDni()){
                guestList.add(guest);
            } else {
                System.out.println("El cliente ya esta cargado en el sistema");
            }
        }
    }

    public void addRecepcionist(Receptionist receptionist) {
        for (Receptionist recep: receptionistList){
            if (recep.getDni() != receptionist.getDni()){
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
        Booking booking = new Booking();

        if (room.available == AvailableRoom.AVAILABLE) {
            booking.setGuest(guest);
            booking.roomNumber = room.roomNumber;
            booking.setCheckInDate(checkIn);
            booking.setCheckOutDate(checkOut);
            bookingList.add(booking);
        }
    }


}
