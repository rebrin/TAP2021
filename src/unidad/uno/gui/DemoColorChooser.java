package unidad.uno.gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoColorChooser  {

    JFrame ventana;
    JLabel banner;
    JColorChooser jcc;
    JButton boton;

    DemoColorChooser(){
        ventana=new JFrame("Demo Color Chooser");
        banner=new JLabel("Hola mundo");
        banner.setOpaque(true);
        banner.setForeground(Color.MAGENTA);

        boton=new JButton("color");

        //acomodo en ventana
        ventana.setLayout(new FlowLayout());
        ventana.add(banner);
        ventana.add(boton);

        //programo el inicio del JCC
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcc=new JColorChooser(banner.getForeground());
                Color c=jcc.showDialog(null,"selecciona",Color.RED);
                banner.setForeground(c);
            }
        });

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,300);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoColorChooser();
    }


}
