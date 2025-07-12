public class Moto extends Vehiculo {
    private boolean cascoObligatorio;

    public Moto(String marca, int velocidad, boolean cascoObligatorio) {
        super(marca, velocidad);
        this.cascoObligatorio = cascoObligatorio;
    }
}
