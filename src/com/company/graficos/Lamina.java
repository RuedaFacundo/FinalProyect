package com.company.graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Lamina extends JPanel {

    private Image imagen;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font myFont = new Font("Arial", Font.BOLD, 26);

        g2.setFont(myFont);

        g2.drawString("Iniciar sesion", 100, 100);

        try{
            imagen = ImageIO.read(new File("src/com/company/graficos/hotel.png"));
        } catch (IOException e){
            System.out.println("La imagen no se encuentra");
        }

        g2.drawImage(imagen, 5, 5, null);


    }
}
