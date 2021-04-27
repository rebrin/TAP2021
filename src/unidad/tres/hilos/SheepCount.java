package unidad.tres.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepCount {
    AtomicInteger Count; //condición de carrera entre los hilos, es Región Crítica
    public  SheepCount(){
        Count=new AtomicInteger();
    }

    public synchronized void countAndReport(){
        System.out.print(Count.addAndGet(1)+" ");
    }

    public static void main(String[] args) {
        SheepCount sheepCount=new SheepCount();
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            for (int i = 0; i < 10; i++) {
                service.submit(() -> sheepCount.countAndReport());
            }
        }finally {
            if(service!=null){
                service.shutdown();

            }
        }

    }
}
