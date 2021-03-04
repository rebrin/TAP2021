package unidad.uno.gui.grid.calcu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DOperandos implements ActionListener {
    JLabel res;


    DOperandos(JLabel result){
        res=result;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b= (JButton) e.getSource();

        if(res.getText().equals("0")||res.getText().equals("0.0"))
            res.setText(b.getText());
        else
            res.setText(res.getText()+b.getText());
    }
}
