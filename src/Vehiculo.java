public class Vehiculo {

    protected String marca;
    protected float velocidad;

    public Vehiculo(String marca, float velocidad){

        this.marca = marca;
        this.velocidad = velocidad;

    }

    public float getVelocidad() {
        return velocidad;
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String desplazar(){
        return "Vehiculo desplazando";
    }
}
