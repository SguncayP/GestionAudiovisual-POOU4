package modelo;


public class Pelicula extends ContenidoAudiovisual {
   private String estudio;
   private Actor actor; // Relación de Asociación

   public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, Actor actor) {
       super(titulo, duracionEnMinutos, genero);
       this.estudio = estudio;
       this.actor = actor;
   }

   // --- Getters y Setters ---
   public String getEstudio() {
       return estudio;
   }

   public void setEstudio(String estudio) {
       this.estudio = estudio;
   }

   public Actor getActor() {
       return actor;
   }

   public void setActor(Actor actor) {
       this.actor = actor;
   }
   
   // El método mostrarDetalles() ha sido eliminado.
   // La responsabilidad de imprimir esta información ahora pertenece al paquete 'vista'.
}
