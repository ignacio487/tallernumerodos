public class Motor {
    //atributos a designar:Numero de Motor y Centimetros Cubicos
    private int numeroMotor;
    private int centCub;

    public Motor(int numeroMotor, int centCub){
        this.numeroMotor=numeroMotor;
        this.centCub=centCub;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getCentCub() {
        return centCub;
    }

    public void setCentCub(int centCub) {
        this.centCub = centCub;
    }
}
