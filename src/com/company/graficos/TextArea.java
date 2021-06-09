package com.company.graficos;

import com.company.Exception.EmailException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JPanel {

    private final JTextField oneField;
    private final JTextField secondField;


    public TextArea (){

        JPanel lamina_superior = new JPanel();
        lamina_superior.setLayout(new GridLayout(2, 2));

        JLabel email = new JLabel("Email:");
        lamina_superior.add(email);
        oneField = new JTextField(15);
        lamina_superior.add(oneField);
        JLabel password = new JLabel("Contraseña:");
        lamina_superior.add(password);
        secondField = new JPasswordField(15);
        lamina_superior.add(secondField);

        JButton login = new JButton("Login");
        GetText event = new GetText();
        login.addActionListener(event);
        lamina_superior.setBackground(Color.CYAN);
        add(lamina_superior, BorderLayout.CENTER);
        add(login, BorderLayout.SOUTH);
    }

    private class GetText implements ActionListener {

        @Override
        public void actionPerformed (ActionEvent e){

            String correo = oneField.getText().trim();
            try {
                examineEmail(correo);
            } catch (Exception ex) {
                System.out.println("Ingrese un email correcto");
            }

            System.out.println("La contraseña es: " + secondField.getText().trim());

            String user = oneField.getText();
            String password = secondField.getText();

            if (user.equals("admin@admin.com") && password.equals("admin123")) {
                System.out.println("Login Admin exitoso!");
            } else if (user.equals("recepcionista@hotel.com") && password.equals("recepcion123")) {
                System.out.println("Login Recepcionista exitoso!");
            }
        }

        public void examineEmail (String email) throws EmailException {
            boolean correo = false;
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)=='@'){
                    correo = true;
                }
            }

            if(correo){
                System.out.println("Email correcto");
            } else {
                throw new EmailException("El email debe contener el caracter @ ");
            }
        }
    }

}
