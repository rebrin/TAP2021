package unidad.tres.hilos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaBloqueoLiberado {
    JFrame ventana;
    JComboBox<String> opciones;
    JButton boton;

    public PruebaBloqueoLiberado(){
        ventana=new JFrame("ejemplo de bloqueo");
        opciones=new JComboBox<>();
        opciones.addItem("opcion 1");
        opciones.addItem("opcion 2");
        opciones.addItem("opcion 3");
        boton=new JButton("dormir");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionPesada a=new AccionPesada();
                Thread t1=new Thread(a);
                t1.start();
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
        new PruebaBloqueoLiberado();
    }
}
