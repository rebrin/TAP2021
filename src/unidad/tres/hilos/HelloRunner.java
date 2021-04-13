package unidad.tres.hilos;

public class HelloRunner implements Runnable{
    String nombre;
    public HelloRunner(String n){
        this.nombre=n;
    }
    @Override
    public void run() {
        int i;
        for(i=0;i<50;i++){
            System.out.println(nombre+":"+"hola "+i);
        }
    }
}
