package com.company;

public abstract class User {

    private String name;
    private String key;
    private int dni;
    private int phone;
    private String email;

    public User() {
    }

    public User(String name, String key, int dni, int phone, String email) {
        this.name = name;
        this.key = key;
        this.dni = dni;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "\n" + "Key: " + this.key + "\n" + "DNI: " + this.dni + "\n" + "E-Mail: " + this.email;
    }

}
