package unidad.tres.hilos;

public class TestProductorConsu {
    public static void main(String[] args) {
        MyStack pila=new MyStack();
        Productor p=new Productor(pila);
        Consumidor c=new Consumidor(pila);
        Thread ThProd=new Thread(p);
        Thread ThCons=new Thread(c);
        ThProd.start();
        ThCons.start();
    }
}
