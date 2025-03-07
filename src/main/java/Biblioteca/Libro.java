package Biblioteca;

/**
 * Esta clase muestra un libro con su título, autor y años de la publicación
 * @author Lara Serralvo aka github.com/LaraSerralvo
 * @version 1.0
 */

public class Libro {

    /**
     * El primer atributo corresponde al título del libro
     * El segungo atributo corresponde al autor del libro
     * El tercer atributo corresponde al año de publicación del libro
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Se crea un nuevo libro con el título, autor y año de publicación
     * @param titulo título del libro.
     * @param autor autor del libro.
     * @param anioPublicacion año de publicación del libro.
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el nombre del autor del libro
     * @return El autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el año de publicación del libro
     * @return El año en el que se publicó el libro
     */
    // TODO: Documentar este método
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
