package unidad.tres.hilos;

public class TestRunner {
    public static void main(String[] args) {
        HelloRunner hr1,hr2,hr3;
        hr1=new HelloRunner("hilo1");
        hr2=new HelloRunner("hilo2");
        hr3=new HelloRunner("hilo3");
        //debemos pasar este objeto como argumento a Thread
        Thread t1=new Thread(hr1);
        Thread t2=new Thread(hr2);
        Thread t3=new Thread(hr3);
        t1.start();
        t2.start();
        t3.start();
    }
}
