package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.SerieDeTV;
import modelo.Temporada;

class SerieDeTVTest {

    @Test
    void testSerieDeTVConstructor() {
        // Constructor con solo 3 parámetros, tal como lo definiste arriba
        SerieDeTV s = new SerieDeTV("Breaking Bad", 45, "Drama");
        
        // Luego agregas la temporada si es necesario para el test
        s.agregarTemporada(new Temporada(1,10)); 

        assertEquals("Breaking Bad", s.getTitulo());
        assertNotNull(s.getListaTemporadas());
        assertEquals(1, s.getListaTemporadas().size());
    }
}
