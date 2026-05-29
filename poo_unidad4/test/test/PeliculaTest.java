package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Pelicula;

class PeliculaTest {

    @Test
    void testPeliculaCompleta() {
        Pelicula p = new Pelicula("Inception", 148, "Ciencia Ficcion", "Warner", null);
        assertEquals("Inception", p.getTitulo());
        assertEquals(148, p.getDuracionEnMinutos());
        assertEquals("Ciencia Ficcion", p.getGenero());
        // Borra la línea del assertNull si el método getInvestigador no existe en Pelicula
    }
}