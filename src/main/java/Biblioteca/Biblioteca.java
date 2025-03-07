package Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es una biblioteca con una coleccón de libros.
 * Con los métodos creados deja añadir, eliminar y buscar diferentes libros por título y autor.
 * @author Lara Serralvo aka github.com/LaraSerralvo
 * @version 1.0
 */

public class Biblioteca {

    /**
     * Este metodo muestra la lista de los libros que contiene la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Se trata del constructor por defecto de la biblioteca que no contiene libros.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Este constructor inicializa la Biblioteca con una lista de libros.
     * @param libros
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Devuelve la lista de libros que contiene la biblioteca.
     * @return lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título.
     * @param titulo del lirbo a buscar.
     * @return libro encontrado
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca un libro por el nombre del autor.
     * @param autor del libro a buscar.
     * @return libro encontrado del autor.
     */
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * BUsca los libros del autor seleccionado.
     * @param autor de los libros que se quieren buscar.
     * @return lista de los libros de dicho autor.
     */
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}