package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class EJBoxLayout {
    JFrame ventana;
    JButton b1,b2,b3,b4,b5;

    EJBoxLayout(){
        ventana=new JFrame("Ejemplo flowlayout");
        JPanel PBox=new JPanel();
        b1=new JButton("boton 1");
        b2=new JButton("boton 2");
        b3=new JButton("boton 3");
        b4=new JButton("boton 4");
        b5=new JButton("boton 5");
        //componentes dentro del panel
        PBox.setLayout(new BoxLayout(PBox,BoxLayout.Y_AXIS));
        PBox.add(b1);
        PBox.add(b2);
        PBox.add(b3);
        PBox.add(b4);
        PBox.add(b5);
        ventana.add(PBox, BorderLayout.CENTER);

        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new EJBoxLayout();
    }
}
