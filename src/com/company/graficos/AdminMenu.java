package com.company.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class AdminMenu extends JPanel {

    private final JPanel sheet;

    public AdminMenu (){
        sheet = new JPanel();
        sheet.setLayout(new GridLayout(16,1, 2, 5));
        addButtom("Cargar Administrador");
        addButtom("Cargar Recepcionista");
        addButtom("Cargar Cliente");
        addButtom("Cargar Reserva");
        addButtom("Check In");
        addButtom("Check Out");
        addButtom("Listar Administradores");
        addButtom("Buscar un Administrador");
        addButtom("Listar Recepcionistas");
        addButtom("Buscar un Recepcionista");
        addButtom("Listar Reservas");
        addButtom("Mostrar Reservas del dia");
        addButtom("Listar Habitaciones");
        addButtom("Mostrar Habitaciones Disponibles");
        addButtom("Remover una Habitacion");
        addButtom("Back up");
        sheet.setBackground(Color.CYAN);
        add(sheet);
    }
    
    private void addButtom (String name){
        JButton boton = new JButton(name);
        sheet.add(boton, BorderLayout.CENTER);
    }

}
