package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class EjBorderLay {
    JFrame ventana;
    JButton b1,b2,b3,b4,b5;

    EjBorderLay(){
        //pido memoria
        ventana= new JFrame("Ejemplo Border");
        b1=new JButton("Norte");
        b2=new JButton("Sur");
        b3=new JButton("Este");
        b4=new JButton("Oeste");
        b5=new JButton("Centro");

        JPanel panelCentral=new JPanel();
        JTextField texto=new JTextField(10);

        //añado elementos en el contenedor
        ventana.add(b1, BorderLayout.NORTH);
        ventana.add(b2, BorderLayout.SOUTH);
        ventana.add(b3, BorderLayout.EAST);
        ventana.add(b4, BorderLayout.WEST);
        //añadimos el panel central
        panelCentral.add(texto);
        panelCentral.add(b5);
        ventana.add(panelCentral,BorderLayout.CENTER);
        //ventana.add(b5, BorderLayout.CENTER);
        //parametros para ventanas
        ventana.setVisible(true);
        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjBorderLay();
    }

}
