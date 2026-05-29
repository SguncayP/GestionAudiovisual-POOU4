
package modelo;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // Asegúrate de tener la clase Investigador importada

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    // Getters y Setters
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    public Investigador getInvestigador() { return investigador; }
    public void setInvestigador(Investigador investigador) { this.investigador = investigador; }
}