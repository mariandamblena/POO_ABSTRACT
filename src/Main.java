import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Libro libro1 = new Libro("Peluche","Peluche2",1995);
        Libro libro2 = new Libro("Catamaran de putas","El loco geran",1994);
        Libro libro3 = new Libro("Como hacer reir a un boludo jaja","tu macho",2000);


        Biblioteca labiblio = new Biblioteca("La Biblio");

        labiblio.agregarLibro(libro1);
        labiblio.agregarLibro(libro2);
        labiblio.agregarLibro(libro3);

        labiblio.ordenarPorAnio();
        System.out.println(labiblio.listarLibros());

        labiblio.ordenarPorAutor();
        System.out.println(labiblio.listarLibros());

        labiblio.ordenarPorTitulo();
        System.out.println(labiblio.listarLibros());





    }

}