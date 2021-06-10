package com.company.graficos;

import javax.swing.*;
import java.awt.*;

public class AdminFrame extends JFrame {

    public AdminFrame (){
        Toolkit window = Toolkit.getDefaultToolkit();
        Dimension screenSize = window.getScreenSize();

        int heightScreen = screenSize.height;
        int widhtScreen = screenSize.width;

        setSize(widhtScreen/2, heightScreen/2);
        setLocation(widhtScreen/4, heightScreen/4);

        setTitle("Hotel - Gestion de Reservas - Administrador");

        Image miIcon = window.getImage("src/com/company/graficos/icono.png");
        setIconImage(miIcon);

        AdminMenu menu = new AdminMenu();
        menu.setBackground(Color.CYAN);
        add(menu);


    }
}
