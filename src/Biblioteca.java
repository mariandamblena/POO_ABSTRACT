import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;


    public Biblioteca(String nombre, ArrayList<Libro> libros){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public String listarLibros(){
        int j = this.libros.size();
        String lista = "";
        for ( int i= 0; i < j ; i++ ){
            lista = lista + "\n" + libros.get(i).getAutor();
        }
        return lista;
    }

}
