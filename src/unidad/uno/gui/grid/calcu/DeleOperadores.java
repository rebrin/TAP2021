package unidad.uno.gui.grid.calcu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleOperadores implements ActionListener {
    JLabel res;
    Double total,op2,op1;
    String OpPend="";


    DeleOperadores(Double o1, Double o2, JLabel r){
        //op1=o1;
        op2=o2;
        total=0d;
        res=r;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        op2=Double.parseDouble(res.getText().toString());
        JButton b= (JButton) e.getSource();
        String comando=b.getText();
        switch(comando){
            case "+":
                total+=op2;
                res.setText("0");
                OpPend="+";
                break;
            case "-":
                if(total==0)
                    total=op2;
                else
                    total-=op2;
                res.setText("0");
                OpPend="-";
                break;
            case "*":
                total*=op2;
                break;
            case "/":
                if(op2!=0)
                    total/=op2;
                break;
            case "=":
                if(!OpPend.equals("")){
                    if(OpPend.equals("+")){
                        total+=op2;
                    }else if(OpPend.equals("-")){
                        total-=op2;
                    }//faltaria implementar multiplicación y la división
                }
                res.setText(total.toString());
                total=0d;
                op2=0d;
                OpPend="";
                break;
        }

    }
}
