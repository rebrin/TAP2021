package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventosMultMouse2021 implements MouseMotionListener, MouseListener {
    //componentes
    JFrame ventana;
    JLabel label;
    JTextField coord;

    //constructor
    public EventosMultMouse2021(){
        ventana=new JFrame("eventos multiples mouse");
        label=new JLabel("arrastra el mouse en la ventana");
        coord=new JTextField();
        //añadir el listener
        ventana.addMouseListener(this);
        ventana.addMouseMotionListener(this);

        //añadir los componentes
        ventana.add(label, BorderLayout.NORTH);
        ventana.add(coord, BorderLayout.SOUTH);

        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        coord.setText("arrastrando coord:"+e.getX()+","+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {    }

    @Override
    public void mouseClicked(MouseEvent e) {
        coord.setText("haz realizado un click!!!");
    }

    @Override
    public void mousePressed(MouseEvent e) {    }

    @Override
    public void mouseReleased(MouseEvent e) {    }

    @Override
    public void mouseEntered(MouseEvent e) {
        coord.setText("haz entrado al Area de trabajo");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        coord.setText("haz salido del area de trabajo");
    }

    public static void main(String[] args) {
        new EventosMultMouse2021();
    }
}
