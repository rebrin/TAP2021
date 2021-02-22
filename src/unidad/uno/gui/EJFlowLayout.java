package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class EJFlowLayout {
    JFrame ventana;
    JButton b1,b2,b3,b4,b5;

    EJFlowLayout(){
        ventana=new JFrame("Ejemplo flowlayout");
        b1=new JButton("boton 1");
        b2=new JButton("boton 2");
        b3=new JButton("boton 3");
        b4=new JButton("boton 4");
        b5=new JButton("boton 5");

        ventana.setLayout(new FlowLayout());
        //añadir los componentes a mi contenedor principal
        ventana.add(b1);
        ventana.add(b2);
        ventana.add(b3);
        ventana.add(b4);
        ventana.add(b5);

        //parametros de ventana
        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new EJFlowLayout();
    }
}
