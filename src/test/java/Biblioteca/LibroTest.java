package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    private Libro lib;

    @BeforeEach
    void setUp() {
        lib = new Libro("Marina", "Carlos Ruiz Zafon", 2000);
    }

    @Test
    void getTitulo() {
        System.out.println("el título es 'Marina");
        assertEquals("Marina", lib.getTitulo(), "el título es 'Marina");
    }

    @Test
    void setTitulo() {
        lib.setTitulo("Valeria");
        System.out.println("El título debe ser Valeria");
        assertEquals("Valeria", lib.getTitulo(), "El nuevo título tieen que ser Valeria");
    }

    @Test
    void getAutor() {
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
    }

    @Test
    void setAnioPublicacion() {
    }
}