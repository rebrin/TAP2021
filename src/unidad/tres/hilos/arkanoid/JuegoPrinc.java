package unidad.tres.hilos.arkanoid;

import com.mysql.cj.jdbc.IterateBlock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class JuegoPrinc extends JPanel implements Runnable, MouseMotionListener {

    ArrayList<Ladrillo> ladrillos;
    Barra barra;
    Bolita bolita;
    Graphics2D g;
    public int Dy;
    public int Dx;
    boolean jugando=true;
    int tiempo=3;


    public JuegoPrinc(){
        Dy=-1;
        Dx=1;
        ladrillos=new ArrayList<>();
        barra=new Barra(400,540);
        bolita=new Bolita(400,510);
        for(int j=0;j<3;j++){
            for(int i=0;i<800/50;i++){
                ladrillos.add(new Ladrillo(1+50*i,j*20,
                        50,20));
            }
        }
        addMouseMotionListener(this);
    }

    @Override
    public synchronized void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g=(Graphics2D) g;
        for (Ladrillo l:ladrillos
             ) {
            l.pintar(this.g);
        }
        barra.pintar(this.g);
        bolita.pintar(this.g);
    }


    @Override
    public void run() {
       while(jugando){
           try {
               Thread.sleep(tiempo);
               bolita.x+=Dx;
               if((bolita.y+=Dy)>0)
                   bolita.y+=Dy;
               /*colision con las orillas*/
               if(bolita.x>=getWidth()||bolita.x<=0){
                   Dx*=-1;

               }
               if(bolita.y<=0){
                   Dy*=-1;
               }
               /*colision con la barra*/
                if(bolita.x>=barra.x &&
                        bolita.x<barra.x+ barra.ancho
                        &&bolita.y == barra.y){
                    Dy*=-1;
                }
                /*colision con los bloques*/
               Iterator<Ladrillo> it=ladrillos.iterator();
               while(it.hasNext()){
                   Ladrillo ladrillo=it.next();
                   if(bolita.x>=ladrillo.getX() &&
                           bolita.x<ladrillo.getX()+ ladrillo.getAncho()
                           &&bolita.y == ladrillo.getY()){
                       it.remove();//elimino el ladrillo
                       Dy*=-1;
                       java.awt.Toolkit.getDefaultToolkit().beep();
                   }
               }

               repaint();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    @Override
    public void mouseDragged(MouseEvent e) {    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(e.getX()<590){
            barra.x=e.getX();
            repaint();
        }
    }
}
