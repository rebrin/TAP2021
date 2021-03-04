package unidad.uno.gui.grid.calcu;

import javax.swing.*;
import java.awt.*;

public class DemoGrid {

    JFrame ventana;
    JLabel LblRes;
    JButton[] Boperandos;
    JButton opMas;
    JButton opMenos;
    JButton opPor;
    JButton opEntre;
    JButton opIgual;
    //operadores
    Double total,op2;



    DemoGrid(){
        //armado de ventana
        LblRes=new JLabel("0");
        LblRes.setFont(new Font("Serif",Font.PLAIN,23));
        LblRes.setBackground(Color.WHITE);
        LblRes.setOpaque(true);
        total=0d;
        op2=0d;
        ventana=new JFrame("Calculadora simple");
        //panel para operadores
        Boperandos=new JButton[10];
        JPanel panelOperandos=new JPanel();
        JPanel pOperadores=new JPanel(); //panel para botones operadores
        /*creación de los operadores*/
        DeleOperadores DOp=new DeleOperadores(total, op2,LblRes);
        opMas=new JButton("+");
        opMas.setFont(new Font("Serif",Font.PLAIN,23));
        opMas.addActionListener(DOp);
        opMenos=new JButton("-");
        opMenos.setFont(new Font("Serif",Font.PLAIN,23));
        opMenos.addActionListener(DOp);
        opPor=new JButton("x");
        opPor.setFont(new Font("Serif",Font.PLAIN,23));
        opPor.addActionListener(DOp);
        opEntre=new JButton("/");
        opEntre.setFont(new Font("Serif",Font.PLAIN,23));
        opEntre.addActionListener(DOp);
        opIgual=new JButton("=");
        opIgual.addActionListener(DOp);
        opIgual.setFont(new Font("Serif",Font.PLAIN,23));
        pOperadores.setLayout(new GridLayout(2,3,5,5));
        pOperadores.add(opMas);
        pOperadores.add(opMenos);
        pOperadores.add(opPor);
        pOperadores.add(opEntre);
        pOperadores.add(opIgual);



        panelOperandos.setLayout(new GridLayout(4,3,4,4));
        //inicializa los botones para operadores
        for(int i=0;i<10;i++){
            Boperandos[i]=new JButton(""+(i+1)%10);
            Boperandos[i].addActionListener(new DOperandos(LblRes));
            //agregar los botones a nuestro panel
            panelOperandos.add(Boperandos[i]);
        }


        ventana.add(LblRes,BorderLayout.NORTH);
        ventana.add(panelOperandos,BorderLayout.WEST);
        ventana.add(pOperadores,BorderLayout.EAST);

        ventana.setSize(400,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        new DemoGrid();
    }
}
