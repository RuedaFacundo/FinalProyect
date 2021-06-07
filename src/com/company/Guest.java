package com.company;

import java.util.ArrayList;
import java.util.List;

public class Guest {

    private String name;
    private int dni;
    private int phone;
    private String address;
    private int roomNumber;
    private String origin;
    List <Consumption> consumptionList = new ArrayList<>();

    public Guest() {
    }

    public Guest(String name, int dni, int phone, String address, int roomNumber, String origin, List <Consumption> consumptionList) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.address = address;
        this.roomNumber = roomNumber;
        this.origin = origin;
        this.consumptionList = consumptionList;
    }

    public int getDni() {
        return dni;
    }

    public void addConsumption (Consumption consumption){
        consumptionList.add(consumption);
    }

    public void showConsumption (){
        for (Consumption consumption : consumptionList){
            System.out.println(consumption);
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "\n" + "Teléfono: " + this.phone + "\n" + "Dirección: " + this.address + "\n" + "Nro de Habitación: " + this.roomNumber + "\n" + "Lugar de origen: " + this.origin;
    }


}
