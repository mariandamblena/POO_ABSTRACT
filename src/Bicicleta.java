public class Bicicleta extends Vehiculo {

    private String rodado;
    private String talle;

    public Bicicleta(String marca, int velocidad, String rodado, String talle) {
        super(marca, velocidad);
        this.rodado = rodado;
        this.talle = talle;
    }

    @Override
    public String desplazar() {
        return "Pedaleando la bicicleta...";
    }
}
