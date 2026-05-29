package modelo;

/**
 * Clase Streaming - Representa contenido disponible en plataformas digitales.
 * Refactorizada para cumplir con el principio SRP.
 */
public class Streaming extends ContenidoAudiovisual {
    private String plataforma;
    private double precioSuscripcion;

    public Streaming(String titulo, int duracionEnMinutos, String genero, String plataforma, double precioSuscripcion) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.precioSuscripcion = precioSuscripcion;
    }

    // --- Getters y Setters ---
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public double getPrecioSuscripcion() { return precioSuscripcion; }
    public void setPrecioSuscripcion(double precioSuscripcion) { this.precioSuscripcion = precioSuscripcion; }
    
    // El método mostrarDetalles() ha sido eliminado para delegar 
    // la responsabilidad de visualización al paquete 'vista'.
}