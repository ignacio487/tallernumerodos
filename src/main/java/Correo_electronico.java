public class Correo_electronico {
    //atributos a designar: Direccion correo y Proveedor
    private String direccionCorreo;
    private String proveedor;

    public Correo_electronico (String direccionCorreo,String proveedor){
        this.direccionCorreo=direccionCorreo;
        this.proveedor=proveedor;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
