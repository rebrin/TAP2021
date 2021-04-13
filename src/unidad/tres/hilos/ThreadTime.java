package unidad.tres.hilos;

public class ThreadTime implements Runnable{
    int contador;
    String nombre;
    public ThreadTime(String n){
        nombre=n;
        contador=0;
    }
    @Override
    public void run() {
        while(contador<59){
            System.out.println(nombre+":"+contador++);
            contador=contador%60;
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
