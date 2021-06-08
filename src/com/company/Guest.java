package com.company;

import java.util.ArrayList;
import java.util.List;

public class Guest {

    private String name;
    private String dni;
    private String phone;
    private String address;
    private int roomNumber;
    private String origin;
    List <Consumption> consumptionList = new ArrayList<>();

    public Guest() {
    }

    public Guest(String name, String dni, String phone, String address, int roomNumber, String origin, List <Consumption> consumptionList) {
        this.name = name;
        try{
            examineDni(dni);
        } catch (Exception e){
            System.out.println("Ingrese correctamente el DNI");
        }
        this.phone = phone;
        this.address = address;
        this.roomNumber = roomNumber;
        this.origin = origin;
        this.consumptionList = consumptionList;
    }

    public String getDni() {
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

    public void examineDni (String dni) throws DniLength{
        if(dni.length()>8){
            throw new DniLength("El DNI no puede contener mas de 8 caracteres");
        } else {
            this.dni = dni;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "\n" + "Teléfono: " + this.phone + "\n" + "Dirección: " + this.address + "\n" + "Nro de Habitación: " + this.roomNumber + "\n" + "Lugar de origen: " + this.origin;
    }


}
