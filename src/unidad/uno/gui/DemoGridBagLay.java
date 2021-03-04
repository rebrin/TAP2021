package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class DemoGridBagLay {
    JFrame ventana;
    //JPanel panelPrinc;
    GridBagConstraints gbc;
    JButton b1,b2,b3,b4,b5;

    DemoGridBagLay(){
        ventana=new JFrame("GridBag");
        ventana.setLayout(new GridBagLayout());
       // panelPrinc=new JPanel();
        //panelPrinc.setLayout(new GridBagLayout());
        gbc=new GridBagConstraints();
        //comenzamos con los botones
        b1=new JButton("boton 1");
        b2=new JButton("boton 2");
        b3=new JButton("boton 3");
        b4=new JButton("boton 4");
        b5=new JButton("boton 5");
        //colocamos en su posicion b1
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weightx=0.05;
        gbc.weighty=0.05;
        gbc.fill=GridBagConstraints.BOTH;
        ventana.add(b1,gbc);
        //colocamos el b2
        gbc=new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.weightx=0.05;
        gbc.weighty=0.05;
        gbc.fill=GridBagConstraints.BOTH;
        ventana.add(b2,gbc);
        //colocar el b3
        gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.weightx=0.1;
        gbc.weighty=0.1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets=new Insets(10,0,10,0);
        ventana.add(b3,gbc);
        //colocar el b4
        gbc=new GridBagConstraints();
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.weightx=0.1;
        gbc.weighty=0.1;
        gbc.fill=GridBagConstraints.BOTH;
        ventana.add(b4,gbc);
        //colocar el b5
        gbc=new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.weightx=0.1;
        gbc.weighty=0.1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets=new Insets(5,0,0,0);
        ventana.add(b5,gbc);




        //añadir panel a ventana
       // ventana.add(panelPrinc,BorderLayout.CENTER);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300,200);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoGridBagLay();
    }
}
