public class Automovil {
    //atributos a designar: Marca, Año, Modelo y precio

    private String marca;
    private int año;
    private String modelo;
    private int precio;

    public Automovil (String marca, int año,String modelo,int precio){
        this.marca=marca;
        this.año=año;
        this modelo= modelo;
        this precio= precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
