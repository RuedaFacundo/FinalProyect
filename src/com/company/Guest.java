package com.company;

public class Guest {

    private String name;
    private int phone;
    private String address;
    private int roomNumber;
    private String origin;

    public Guest() {
    }

    public Guest(String name, int phone, String address, int roomNumber, String origin) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.roomNumber = roomNumber;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "\n" + "Teléfono: " + this.phone + "\n" + "Dirección: " + this.address + "\n" + "Nro de Habitación: " + this.roomNumber + "\n" + "Lugar de origen: " + this.origin;
    }


    /// metodos check in
    /// metodos check out
}
