package com.company;

public class Room {

    private int roomNumber;
    RoomType type;
    AvailableRoom available;
    boolean occupiedRoom;

    public Room() {
    }

    public Room(int roomNumber, RoomType type, AvailableRoom available, boolean occupiedRoom) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.available = available;
        this.occupiedRoom = occupiedRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.type + "\n" + "Disponibilidad: " + this.available + "\n" + "Estado: " + this.occupiedRoom;
    }
}
