public class Chasis {
    //atributos a designar: Numero de chasis y tipo de material

    private int numeroChasis;
    private String material;

    public Chasis(int numeroChasis, String material){
        this.numeroChasis = numeroChasis;
        this.material = material;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
