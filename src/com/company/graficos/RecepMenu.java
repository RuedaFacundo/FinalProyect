package com.company.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RecepMenu extends JPanel{

    private final JPanel sheet;

    public RecepMenu (){
        sheet = new JPanel();
        sheet.setLayout(new GridLayout(8,1, 2, 5));
        addButtom("Cargar Cliente");
        addButtom("Cargar Reserva");
        addButtom("Check In");
        addButtom("Check Out");
        addButtom("Listar Reservas");
        addButtom("Mostrar Reservas del dia");
        addButtom("Listar Habitaciones");
        addButtom("Mostrar Habitaciones Disponibles");
        sheet.setBackground(Color.CYAN);
        add(sheet);
    }

    private void addButtom (String name){
        JButton boton = new JButton(name);
        sheet.add(boton, BorderLayout.CENTER);
    }
}
