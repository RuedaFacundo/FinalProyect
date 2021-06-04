package com.company.graficos;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame (){
        Toolkit window = Toolkit.getDefaultToolkit();
        Dimension screenSize = window.getScreenSize();

        int heightScreen = screenSize.height;
        int widhtScreen = screenSize.width;

        setSize(widhtScreen/2, heightScreen/2);
        setLocation(widhtScreen/4, heightScreen/4);

        setTitle("Hotel - Gestion de Reservas");

        Image miIcon = window.getImage("src/com/company/graficos/icono.png");
        setIconImage(miIcon);

        Lamina lamina = new Lamina();
        lamina.setBackground(Color.CYAN);
        add(lamina);


    }
}
