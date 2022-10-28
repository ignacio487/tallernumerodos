public class Persona {
    //atributos a designar: nombre, apellido, rut
    private String nombre;
    private String apellido;
    private int rut;

    public Persona(String nombre, String apellido, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }
}