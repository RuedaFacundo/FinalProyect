package com.company;

public class Receptionist extends User {

    public Receptionist (){
        super();
    }

    public Receptionist (String name, String key, int dni, int phone, String email){
        super(name, key, dni, phone, email);
    }

    /// metodo chequear reserva
    /// metodo verificar disponibilidad de habitacion
}
