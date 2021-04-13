package unidad.tres.hilos;

public class HiloHerencia extends Thread{
    @Override
    public void run() {
        super.run();
        int contador=0;
        while(true){
            System.out.println(contador++);
            contador%=60;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new HiloHerencia();
        t1.start();
    }
}
