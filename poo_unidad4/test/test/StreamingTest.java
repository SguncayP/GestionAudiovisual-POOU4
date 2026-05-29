package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Streaming;

class StreamingTest {

    @Test
    void testStreamingConstructor() {
        Streaming s = new Streaming("Stranger Things", 50, "Ciencia Ficción", "Netflix", 9.99);
        
        assertEquals("Stranger Things", s.getTitulo());
        assertEquals("Netflix", s.getPlataforma());
        assertEquals(9.99, s.getPrecioSuscripcion(), 0.001); // 0.001 es para la precisión decimal
    }
}