package com.company;

public class Recepcionist extends User {

    public Recepcionist (){
        super();
    }

    public Recepcionist (String name, String key, int dni, int phone, String email){
        super(name, key, dni, phone, email);
    }

    /// metodo chequear reserva
    /// metodo verificar disponibilidad de habitacion
}
