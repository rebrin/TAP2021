package unidad.tres.hilos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaBloqueo {
    JFrame ventana;
    JComboBox<String> opciones;
    JButton boton;

    public PruebaBloqueo(){
        ventana=new JFrame("ejemplo de bloqueo");
        opciones=new JComboBox<>();
        opciones.addItem("opcion 1");
        opciones.addItem("opcion 2");
        opciones.addItem("opcion 3");
        boton=new JButton("dormir");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //esta acción paraliza el evento de la aplicacion
                    Thread.sleep(5000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });

        //añadir los componentes a la ventana
        ventana.setLayout(new FlowLayout());
        ventana.add(opciones);
        ventana.add(boton);
        //acciones para ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setSize(400,300);
    }

    public static void main(String[] args) {
        new PruebaBloqueo();
    }
}
