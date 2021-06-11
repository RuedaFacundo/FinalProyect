package com.company;

import com.company.Enum.AvailableRoom;
import com.company.Enum.ConsumptionType;
import com.company.Enum.RoomType;
import com.company.Models.*;
import com.company.graficos.Frame;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Frame pantalla = new Frame();

        pantalla.setVisible(false);

        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        List<Admin> adminList = new ArrayList<>();
        List<Receptionist> receptionistList = new ArrayList<>();
        List<Room> roomList = new ArrayList<>();
        List<Guest> guestList = new ArrayList<>();
        List<Booking> bookingList = new ArrayList<>();
        List<Payment> paymentList = new ArrayList<>();
        List<Consumption> consumptionList = new ArrayList<>();

        Hotel hotel = new Hotel(adminList, receptionistList, roomList, guestList, bookingList, paymentList);

        Admin Facundo = new Admin("Facundo", "340", "36617481", "155478829", "facundo@hotmail.com");
        Receptionist Hernan = new Receptionist("Hernan", "300", "40399920", "15002293", "hernan@gmail.com");
        Guest Alvaro = new Guest("Alvaro", "34095530", "156002933", "Gascon 1050", 5, "ARG", consumptionList);

        hotel.addAdmin(Facundo);
       /// hotel.showAdminList();
        hotel.addRecepcionist(Hernan);
      ///  hotel.showReceptionistList();
        Consumption consumption = new Consumption(ConsumptionType.REFRESCO, 1);
        Alvaro.addConsumption(consumption);
        hotel.addGuest(Alvaro);
     ///   hotel.showGuestList();

        Room r1 = new Room(1, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r2 = new Room(2, RoomType.SIMPLE, AvailableRoom.AVAILABLE, false);
        Room r3 = new Room(3, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r4 = new Room(4, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r5 = new Room(5, RoomType.SIMPLE, AvailableRoom.AVAILABLE, false);
        Room r6 = new Room(6, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r7 = new Room(7, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r8 = new Room(8, RoomType.SIMPLE, AvailableRoom.AVAILABLE, false);
        Room r9 = new Room(9, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        Room r10 = new Room(10, RoomType.DOUBLE, AvailableRoom.AVAILABLE, false);
        hotel.addRoom(r1);
        hotel.addRoom(r2);
        hotel.addRoom(r3);
        hotel.addRoom(r4);
        hotel.addRoom(r5);
        hotel.addRoom(r6);
        hotel.addRoom(r7);
        hotel.addRoom(r8);
        hotel.addRoom(r9);
        hotel.addRoom(r10);

        Booking reser = new Booking(r1, 15, LocalDate.of(2021, 6, 21), LocalDate.of(2021, 6, 29), Alvaro);

        hotel.addBooking(reser);
       /// hotel.showBookingList();

        Facundo.checkIn(reser, paymentList);
      ///  hotel.showPaymentList();

        ///hotel.showRoomOccupied();

        File Adminfile = new File("C:/Users/facun/OneDrive/Desktop/Programacion3/Proyecto Final - Gestion de Reservas/src/com/company/File/admin");
        ///Facundo.writeFile(Facundo, Adminfile);

        Admin Franco = new Admin("Franco", "922", "33617737", "155002111", "franco@gmail.com");
        hotel.addAdmin(Franco);
       /// Franco.writeFile(Franco, Adminfile);
       /// Facundo.readFile(Adminfile);
    }
}
