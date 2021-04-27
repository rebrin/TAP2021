package unidad.tres.hilos;

public class MyStack {
    int idx;
    char [] arr;

    public MyStack(){
        idx=0;
        arr=new char[400];
    }

    public synchronized void push(char c){
        this.notify();
        idx++;
        arr[idx]=c;

    }
    public synchronized char pop(){
        idx--;
        while(idx<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arr[idx];
    }

}
