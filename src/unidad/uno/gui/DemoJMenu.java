package unidad.uno.gui;

import javax.swing.*;

public class DemoJMenu {
    JFrame ventana;
    JMenuBar BarraMenu;
    JMenu Menu1;
    JMenu Menu2;
    JMenu Menu3;
    JMenuItem menuItem1_1;
    JMenuItem menuItem1_2;
    JMenuItem menuItem1_3;

    DemoJMenu(){
        ventana=new JFrame("Ejemplo menu");
        menuItem1_1=new JMenuItem("opcion1");
        menuItem1_2=new JMenuItem("opcion 2");
        menuItem1_3=new JMenuItem("opcion 3");

        Menu1=new JMenu("Menu 1");
        Menu1.add(menuItem1_1);
        Menu1.add(menuItem1_2);
        Menu1.add(menuItem1_3);

        Menu2=new JMenu("menu 2");
        Menu3=new JMenu("menu 3");
        BarraMenu= new JMenuBar();
        BarraMenu.add(Menu1);
        BarraMenu.add(Menu2);
        BarraMenu.add(Menu3);

        ventana.setJMenuBar(BarraMenu);

        ventana.setSize(400,300);
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoJMenu();
    }
}
