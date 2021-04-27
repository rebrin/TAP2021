package unidad.tres.hilos.arkanoid;

import net.sourceforge.barbecue.Main;

import javax.swing.*;
import java.awt.*;

public class MainGame {
    JuegoPrinc princ;
    JFrame ventana;


    public MainGame(){
        princ=new JuegoPrinc();
        ventana=new JFrame("Arkanoid");
        ventana.add(princ, BorderLayout.CENTER);
        ventana.setSize(800,600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread MainThread=new Thread(princ);
        MainThread.start();

    }

    public static void main(String[] args) {
        new MainGame();
    }

}
