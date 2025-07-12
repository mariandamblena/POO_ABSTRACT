public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, int velocidad, int puertas) {
        super(marca, velocidad);// esto llama al constructor de vehiculo
        this.puertas = puertas;
    }

    @Override
    public String desplazar() {
        return "El coche se esta desplazando";
    }

    public String desplazar(String modo){
        return modo.equalsIgnoreCase("manual") ? "En modo manual" : "En modo automático";
    }
}
