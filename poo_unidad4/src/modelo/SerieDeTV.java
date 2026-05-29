package modelo;

import java.util.ArrayList;
import java.util.List;


public class SerieDeTV extends ContenidoAudiovisual {
  
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaTemporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        this.listaTemporadas.add(temporada);
    }

    // --- Getters y Setters ---
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }
    
   
}