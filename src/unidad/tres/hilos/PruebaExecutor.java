package unidad.tres.hilos;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PruebaExecutor {
    public static void main(String[] args) {
        ExecutorService servHilos=null;
        try{
            servHilos= Executors.newSingleThreadExecutor();

            servHilos.execute(()-> System.out.println("esto se ejecuta " +
                    "dese un hilo"));
            servHilos.execute(()->{
                for (int i = 0; i < 100; i++) {
                    System.out.println("cuenta:"+i);
                }
            });
        }finally {
            if(servHilos!=null)
                servHilos.shutdown();
        }
    }
}
