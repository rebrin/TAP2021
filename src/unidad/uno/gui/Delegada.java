package unidad.uno.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delegada implements ActionListener {
    Object padre;
    public Delegada(Object padre){
        this.padre=padre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println("haz dado un click!!");
        JOptionPane.showMessageDialog((Component) padre,
                "haz dado click!!");
    }
}
