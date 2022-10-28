import java.util.Scanner;
import java.util.ArrayList;

public class Gestor_Personal{
    static Scanner intro=new Scanner (System.in);
    Persona nueva;
    ArrayList<Persona>personas;
    Automovil nuevo;
    ArrayList<Automovil>automoviles;


    public  Gestor_Personal(){
        personas= new ArrayList<>();
    }
    private void ingresarPersonas(){
        String nombre= solicitarNombre("persona.");
        String apellido=solicitarApellido("persona.");
        int rut=solicitarRut("persona.");
    }
    public  Gestor_Personal(){
        automoviles=new ArrayList<>();
    }
    private void ingresarAutomoviles(){
        String marca = solicitarMarca("automovil.");
        int año = solicitarAño("automovil.");
        String modelo=solicitarModelo("automovil.");
        int precio=solicitarPrecio("automovil.");
        nuevo= new Automovil(marca,año,modelo,precio);
        automoviles.add(nuevo);
    }
    public static String EncontrarNombre(String tipoSujeto) {
        String nombre = null;
        System.out.println("Ingrese el nombre del "+tipoSujeto);
        nombre = intro.nextLine();
        System.out.println("El nombre ha sido encontrado erróneamente.");
            else System.out.println("Nombre encontrado correctamente.");
        return nombre;
}

}
