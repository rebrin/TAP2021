package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundoGUI implements ActionListener {
    //declarar componentes y contenedor
    JFrame ventana;
    JButton b;

    public HolaMundoGUI(){
        ventana=new JFrame("Primer GUI");
        b=new JButton("da click aqui");

        ventana.add(b, BorderLayout.NORTH);
        b.addActionListener(this);
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new HolaMundoGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("haz dado click");
    }
}
