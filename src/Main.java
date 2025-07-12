

public class Main {
    public static void main(String[] args) {

        Moto motito_1 = new Moto("Peluche", 37, true);
        Moto motito_2 = new Moto("Cuchu", 39, true);
        Moto motito_3 = new Moto("marian", 447, false);

        motito_1.desplazar();
        motito_2.desplazar();
        motito_3.desplazar();

        Coche c = new Coche("Toyota", 120, 4);
        c.desplazar(); // normal
        c.desplazar("automático"); // automático

        Bicicleta b = new Bicicleta("Venzo", 25, "29", "m");
        b.desplazar(); // sobrescrito
    }
}