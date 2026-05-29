package modelo;

/**
 * Clase Temporada - Representa una temporada dentro de una SerieDeTV.
 * Refactorizada para cumplir con SRP (Separación de responsabilidades).
 */
public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    // --- Getters y Setters ---
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getEpisodios() { return episodios; }
    public void setEpisodios(int episodios) { this.episodios = episodios; }

    // El método toString() se eliminó para delegar la 
    // representación visual al paquete 'vista'.
}