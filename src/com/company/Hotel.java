package com.company;

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
        adminList.add(admin);
    }

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    public void addRecepcionist(Receptionist receptionist) {
        receptionistList.add(receptionist);
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }




}
