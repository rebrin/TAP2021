package unidad.tres.hilos;

import java.util.concurrent.*;

public class PruebaSubmit {
    public static int sum=0;
    public static void main(String[] args) {

        ExecutorService service=null;
        try{
            service= Executors.newSingleThreadExecutor();
            Future <?> resultado=service.submit(()->{

                for (int i = 0; i <= 100; i++) {
                    System.out.println(i);
                    sum+=i;
                }
                //Thread.sleep(11000);
                return sum;
            });
            resultado.get(10, TimeUnit.SECONDS);
            System.out.println(sum);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            if(service!=null)
                service.shutdown();
        }

    }
}
