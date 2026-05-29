package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Documental;
import modelo.Investigador;

class DocumentalTest {

	@Test
	void testDocumentalConInvestigador() {
	    // Ejemplo de cómo probar la relación entre clases
		Investigador inv = new Investigador("Attenborough", "Biología Marina");
	    Documental d = new Documental("Nuestro Planeta", 60, "Naturaleza", "Biodiversidad", inv);
	    
	    assertNotNull(d.getInvestigador());
	    assertEquals("Attenborough", d.getInvestigador().getNombre());
	}
}