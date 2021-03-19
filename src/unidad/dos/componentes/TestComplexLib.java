package unidad.dos.componentes;
import sun.com.complex.*;

public class TestComplexLib {


    public static void main(String[] args) {
        Complejo c=new Complejo(3,1);
        c.suma(new Complejo(5,1));
        System.out.println(c);
    }
}
