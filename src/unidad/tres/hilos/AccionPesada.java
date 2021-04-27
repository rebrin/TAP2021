package unidad.tres.hilos;

public class AccionPesada implements Runnable{
    @Override
    public void run() {
        try {
            //esta acción paraliza el evento de la aplicacion
            System.out.println("realizando accion pesada");
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
