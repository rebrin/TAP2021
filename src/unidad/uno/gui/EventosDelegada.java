package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class EventosDelegada {
    JFrame ventana;
    JButton btn;

    public EventosDelegada(){
        ventana=new JFrame("ventana delegada");
        btn=new JButton("Click aqui!!");
        //llama a atender el evento a la clase delegada
        btn.addActionListener(new Delegada(ventana));
        ventana.add(btn, BorderLayout.NORTH);
        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    public static void main(String[] args) {
        new EventosDelegada();
    }
}


