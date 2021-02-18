package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventosAdapter extends MouseAdapter {
    //componentes
    JFrame ventana;
    JLabel label;
    JTextField coord;

    //constructor
    public MouseEventosAdapter(){
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

    public void mouseClicked(MouseEvent e) {
        coord.setText("haz realizado un click!!!");
    }
    public void mouseEntered(MouseEvent e) {
        coord.setText("haz entrado al Area de trabajo");
    }
    public void mouseExited(MouseEvent e) {
        coord.setText("haz salido del area de trabajo");
    }

    public static void main(String[] args){
    new MouseEventosAdapter();
    }
}
