package com.company.Interfaz;

import com.company.Models.Booking;
import com.company.Models.Payment;

import java.time.LocalDate;
import java.util.List;

public interface Check {

    void checkIn (Booking booking, List<Payment> paymentList);
    void checkOut (Booking booking);
    long daysBetween(LocalDate start, LocalDate end);
    void addPayment (Payment payment, List<Payment> paymentList);
}
