package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoEventoAnon {
    JFrame ventana;
    JButton btn;
    JLabel lblEvento;

    public ManejoEventoAnon(){
        ventana=new JFrame("ventana delegada");
        btn=new JButton("Click aqui!!");
        lblEvento=new JLabel("aqui va el evento");

        //llamar de manera anonima un objeto del tipo ActionListener
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // System.out.println("haz realizado un click con anonima");
                lblEvento.setText("haz realizado un click con anonima");
                JOptionPane.showMessageDialog(ventana
                        ,"haz dado click!!");
            }
        });
        ventana.add(btn, BorderLayout.NORTH);
        ventana.add(lblEvento,BorderLayout.SOUTH);
        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new ManejoEventoAnon();
    }
}
