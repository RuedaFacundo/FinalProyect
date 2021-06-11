package com.company.Models;

import com.company.Enum.AvailableRoom;
import com.company.Enum.RoomType;

public class Room {

    protected int roomNumber;
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

    public AvailableRoom getAvailable() {
        return available;
    }

    public void setOccupiedRoom(boolean occupiedRoom) {
        this.occupiedRoom = occupiedRoom;
    }

    public boolean isOccupiedRoom() {
        return occupiedRoom;
    }

    public RoomType getType() {
        return type;
    }

    public boolean isAvailable (){
        boolean result = false;
        if (available == AvailableRoom.AVAILABLE){
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Habitacion: " + this.roomNumber + "\n" + "Tipo: " + this.type + "\n" + "Disponibilidad: " + this.available + "\n" + "Estado: " + this.occupiedRoom;
    }
}
