package com.company.graficos;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame (){
        Toolkit window = Toolkit.getDefaultToolkit();
        Dimension screenSize = window.getScreenSize();

        int heightScreen = screenSize.height;
        int widhtScreen = screenSize.width;

        setSize(heightScreen/2, widhtScreen/2);
        setLocation(heightScreen/4, widhtScreen/4);

        setTitle("Hotel - Gestion de Reservas");

        Image miIcon = window.getImage("src/com/company/graficos/icono.png");
        setIconImage(miIcon);

        Lamina lamina = new Lamina();
        add(lamina);
    }
}
