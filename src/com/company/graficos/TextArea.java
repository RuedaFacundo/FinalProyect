package com.company.graficos;

import com.company.DniLength;
import com.company.EmailException;

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

            String correo = oneField.getText().trim();
            try{
                examineEmail(correo);
            } catch (Exception ex){
                System.out.println("Ingrese un email correcto");
            }

            System.out.println("La contraseña es: " + secondField.getText().trim());
        }

        public void examineEmail (String email) throws EmailException {
            boolean correo = false;
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)=='@'){
                    correo = true;
                }
            }

            if(correo == true){
                System.out.println("Email correcto");
            } else {
                throw new EmailException("El email debe contener el caracter @ ");
            }
        }

    }

}
