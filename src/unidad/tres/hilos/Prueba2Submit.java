package unidad.tres.hilos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Prueba2Submit {
    public static void main(String[] args) {
        ExecutorService service=null;
        try{
            service= Executors.newSingleThreadExecutor();
            Future<Integer> res=service.submit(()->{
                int sum=0;
                for (int i = 0; i <= 100; i++) {
                    sum+=i;
                }
                return sum;
            });
            System.out.println(res.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(service!=null)
                service.shutdown();
        }
    }
}
