package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayDemo {
    JFrame ventana;
    JPanel panelBotones;
    JButton btn1;
    JButton btn2;
    JButton btn3;

    JPanel panelTextFields;
    JTextField tf1;
    JTextField tf2;
    JButton btTF;
    JPanel panelCards;
    JButton btNext;

    CardLayDemo(){
        ventana=new JFrame("Carda Layout Demo");
        //pido memoria para los paneles
        panelBotones=new JPanel();
        panelTextFields=new JPanel();
        panelCards=new JPanel();
        //elementos del primer card
        btn1=new JButton("boton1");
        btn2=new JButton("boton1");
        btn3=new JButton("boton1");
        //elementos del segundo card
        tf1=new JTextField(10);
        tf2=new JTextField(10);
        btTF=new JButton("Aceptar");
        //boton next dentro del ejemplo
        btNext=new JButton("Next");
        btNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout= (CardLayout)
                        panelCards.getLayout();
                cardLayout.next(panelCards);

            }
        });

        //añadir los componentes a su respectivo panel
        //panel de botones
        panelBotones.add(btn1);
        panelBotones.add(btn2);
        panelBotones.add(btn3);
        //panel para TF
        panelTextFields.add(tf1);
        panelTextFields.add(tf2);
        panelTextFields.add(btTF);
        //añadir los paneles al panel de cards
        panelCards.setLayout(new CardLayout());
        panelCards.add(panelBotones,"Panel Botones");
        panelCards.add(panelTextFields,"Panel Textfields");
        //panel central dentro del contenedor
        ventana.add(panelCards,BorderLayout.CENTER);
        ventana.add(btNext,BorderLayout.SOUTH);
        //ventana
        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayDemo();
    }
}
