package unidad.tres.hilos;

public class Productor implements Runnable{
    MyStack myStack;
    int num;
    private static int Counter=1;

    public Productor(MyStack pila){
        myStack=pila;
        num=Counter++;
    }

    @Override
    public void run() {
        char c;
        for(int i=0;i<200;i++){
            c=(char)(Math.random()*26+'A');
            myStack.push(c);
            System.out.println("prod"+num+":"+c);
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
