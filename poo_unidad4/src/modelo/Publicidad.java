package modelo;

/**
 * Clase Publicidad - Representa un contenido publicitario.
 * Refactorizada para cumplir con el principio SRP.
 */
public class Publicidad extends ContenidoAudiovisual {
    private String marca;
    private String producto;

    public Publicidad(String titulo, int duracionEnMinutos, String genero, String marca, String producto) {
        super(titulo, duracionEnMinutos, genero);
        this.marca = marca;
        this.producto = producto;
    }

    // --- Getters y Setters ---
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    
    // El método mostrarDetalles() fue eliminado para delegar esta 
    // responsabilidad al paquete 'vista', manteniendo el modelo limpio.
}
