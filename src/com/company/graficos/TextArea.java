package com.company.graficos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JPanel {

    private JTextField oneField;
    private JTextField secondField;


    public TextArea (){

        JLabel email = new JLabel("Email:");
        add(email);
        oneField = new JTextField(20);
        add(oneField);
        JLabel contraseña = new JLabel("Contraseña:");
        add(contraseña);
        secondField = new JTextField(20);
        add(secondField);


        JButton login = new JButton("Login");
        GetText event = new GetText();

        login.addActionListener(event);
        add(login);


    }

    private class GetText implements ActionListener {

        @Override
        public void actionPerformed (ActionEvent e){

            boolean email = false;

            String correo = oneField.getText().trim();
            for(int i=0; i<correo.length(); i++){
                if(correo.charAt(i)=='@'){
                    email = true;
                }
            }

            if(email == true){
                System.out.println("Email correcto");
            } else {
                System.out.println("Email incorrecto");
            }

            System.out.println("La contraseña es: " + secondField.getText().trim());
        }
    }

}
