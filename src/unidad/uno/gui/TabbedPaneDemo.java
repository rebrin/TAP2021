package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo {

    JFrame ventana;
    JButton[] botones;
    JTextArea AreaTexto;
    JPanel panelBotones;
    JPanel panelTexto;
    JTabbedPane paneles;

    TabbedPaneDemo(){
        //inicializa componentes
        ventana=new JFrame("Tabbed pane");
        //inicializa los botones

        botones=new JButton[10];
        for ( int i=0;i<10 ;i++) {
            botones[i]=new JButton("boton "+i);
        }
        //memoria
        //AreaTexto=new JTextArea();
        panelBotones=new JPanel();
        panelTexto=new JPanel();
        paneles=new JTabbedPane();

        //agregar componentes dentro de los cont
        for (JButton b:botones) {
            panelBotones.add(b);
        }
        //panel texto

        //panelTexto.add(new JScrollPane(new JTextArea()),BorderLayout.CENTER);
        //panel para tab
        paneles.addTab("tab panel",null,panelBotones);
        paneles.addTab("tab Texto",null,new JScrollPane(new JTextArea()));
        ventana.add(paneles,BorderLayout.CENTER);

        //controles de ventana y visibilidad
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800,600);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}
