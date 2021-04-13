package unidad.tres.hilos;

public class TestThreadTime {
    public static void main(String[] args) {
        ThreadTime Hilo=new ThreadTime("H1");
        ThreadTime Hilo2=new ThreadTime("H2");

        Thread t1=new Thread(Hilo);
        Thread t2=new Thread(Hilo2);

        //isalive, para saber si está en ejecución
        System.out.println(t1.isAlive());


        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
