package com.company.Models;

import com.company.Enum.AvailableRoom;
import com.company.Exception.BookingException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.company.Enum.RoomType.DOUBLE;
import static com.company.Enum.RoomType.SIMPLE;
import static java.time.temporal.ChronoUnit.DAYS;

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
            if (administrator.getDni().equals(admin.getDni())) {
                adminList.add(admin);
            } else {
                System.out.println("El administrador ya esta cargado");
            }
        }
    }

    public void addGuest(Guest guest) {
        for (Guest customer : guestList) {
            if (customer.getDni().equals(guest.getDni())) {
                guestList.add(guest);
            } else {
                System.out.println("El cliente ya esta cargado en el sistema");
            }
        }
    }

    public void addRecepcionist(Receptionist receptionist) {
        for (Receptionist recep : receptionistList) {
            if (recep.getDni().equals(receptionist.getDni())) {
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

    public void addBooking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut) throws BookingException {
        if (room.available == AvailableRoom.AVAILABLE) {
            Booking booking = new Booking();
            booking.setGuest(guest);
            booking.roomNumber = room.roomNumber;
            booking.setCheckInDate(checkIn);
            booking.setCheckOutDate(checkOut);
            for (Booking b : bookingList) {
                if ((b.getRoomNumber() == booking.getRoomNumber()) && (b.getCheckInDate() != booking.getCheckInDate())) {
                    bookingList.add(booking);
                } else {
                    throw new BookingException("La habitación se encuentra ocupada en esa fecha!");
                }
            }

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

    public void checkIn (Room room, Booking booking, Guest guest){
        room.occupiedRoom = true;
        long days = daysBetween(booking.getCheckInDate(), booking.getCheckOutDate());
        if(room.type == SIMPLE){
            Payment pay = new Payment(days, 1500, guest);
            addPayment(pay);
        } else if (room.type == DOUBLE) {
            Payment pay = new Payment(days, 2500, guest);
            addPayment(pay);
        }
    }

    public void checkOut (Room room){
        room.occupiedRoom = false;
    }

    public void addPayment (Payment payment){
        paymentList.add(payment);
    }

    public long daysBetween(LocalDate start, LocalDate end){
        return DAYS.between(start, end);
    }

}