package unidad.uno.gui;

public class MiClaseImport {
    String mensaje;

    public MiClaseImport(String msg){
        mensaje=msg;
    }

    public void saludar(String nombre){
        System.out.println("Saludos "+nombre +" bienvenido");
        System.out.println(mensaje);
    }
}
