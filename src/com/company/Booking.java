package com.company;

import java.time.LocalDate;

public class Booking {

    private int bookingID;
    private LocalDate bookingDate;

    public Booking(){}

    public Booking (int bookingID, LocalDate bookingDate){
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
    }


}
