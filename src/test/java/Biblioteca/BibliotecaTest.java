package Biblioteca;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro lib1;
    private Libro lib2;
    private Libro lib3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        lib1 = new Libro("El silencio de la ciudad Blanca", "Blanca Suarez", 2018);
        lib2 = new Libro("Valeria", "Andrea Gomez", 2012);
        lib3 = new Libro("Marina", "Carlos Ruiz Zafon", 2000);
    }

    @org.junit.jupiter.api.Test
    void agregarLibro() {
        boolean añadido = biblioteca.agregarLibro(lib1);
        assertTrue(añadido, "el libro añadido correctamente");
        assertTrue(biblioteca.getLibros().contains(lib1), "la lista de libros deberia tener el libro agregado");
    }


    @org.junit.jupiter.api.Test
    void eliminarLibro() {
        boolean eliminado = biblioteca.eliminarLibro(lib2);
        assertTrue(eliminado, "el libro ha sido eliminado");
        assertFalse(biblioteca.getLibros().contains(lib2), "libro no existente en la lista de libros");
    }


    @org.junit.jupiter.api.Test
    void getLibros() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(lib3);
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Marina");
        assertNotNull(encontrado, "Busqueda del libro 'Marina'");

        System.out.println(("el autor es '" + encontrado.getAutor() + "'").toUpperCase());
        assertEquals("Carlos Ruiz Zafon", encontrado.getAutor(), "El autor es Carlos Ruiz Zafon'");

        Libro noEncontrado = biblioteca.encuentraLibroPorTitulo("El libro no existe");
        assertNull(noEncontrado, "no se encuentra ningún libero con ese titulo");
    }

    @org.junit.jupiter.api.Test
    void encuentaLibroPorAutor() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(lib1);
        biblioteca.agregarLibro(new Libro("La novia gitana", "Carmen Mola", 1937));
        List<Libro> listaLibros = biblioteca.encuentraLibrosPorAutor("Carmen Mola");
        assertNotNull(listaLibros, "devuelve lista de libros existentes del autor");
        assertEquals(1, listaLibros.size(), "el autor debe tener un solo libro en la biblioteca");


        List<Libro> listaInexistente = biblioteca.encuentraLibrosPorAutor("el autor no existe");
        assertNull(listaInexistente, "null porqeu no encuentra libros del autor");
    }
}