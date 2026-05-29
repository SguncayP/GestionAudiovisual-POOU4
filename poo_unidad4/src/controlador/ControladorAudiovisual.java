package controlador;

import modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador para coordinar las operaciones entre el modelo y la vista.
 * Aplica el principio de Inversión de Dependencias (DIP).
 */
public class ControladorAudiovisual {
    private List<ContenidoAudiovisual> listaContenidos;
    private GestorArchivos gestor;

    public ControladorAudiovisual() {
        this.listaContenidos = new ArrayList<>();
        this.gestor = new GestorArchivos();
    }

    public void cargarDatos(String ruta) {
        this.listaContenidos = gestor.cargarDesdeCSV(ruta);
    }

    public void guardarDatos(String ruta) {
        gestor.guardarEnCSV(ruta, listaContenidos);
    }

    public List<ContenidoAudiovisual> getListaContenidos() {
        return listaContenidos;
    }
}