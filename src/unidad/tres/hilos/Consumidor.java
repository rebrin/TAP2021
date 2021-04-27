package unidad.tres.hilos;

public class Consumidor implements Runnable {
    MyStack myStack;
    int num;
    private static int Counter=1;

    public Consumidor(MyStack pila){
        myStack=pila;
        num=Counter++;
    }


    @Override
    public void run() {
        char c;
        for(int i=0;i<200;i++){
            c= myStack.pop();
            System.out.println("cons:"+num+":"+c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
