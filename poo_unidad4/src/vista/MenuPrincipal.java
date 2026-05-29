package vista;

import controlador.ControladorAudiovisual;
import modelo.*;
import java.util.Scanner;

public class MenuPrincipal {
    private ControladorAudiovisual controlador = new ControladorAudiovisual();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n--- GESTOR DE CONTENIDOS AUDIOVISUALES ---");
            System.out.println("1. Cargar datos desde CSV");
            System.out.println("2. Mostrar todos los contenidos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    controlador.cargarDatos("datos.csv");
                    break;
                case 2:
                    mostrarContenidos();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void mostrarContenidos() {
        System.out.println("\n--- LISTA DE CONTENIDOS ---");
        if (controlador.getListaContenidos() == null || controlador.getListaContenidos().isEmpty()) {
            System.out.println("La lista está vacía. Por favor, cargue datos primero.");
            return;
        }

        for (ContenidoAudiovisual c : controlador.getListaContenidos()) {
            String tipo = "";
            
            // Polimorfismo para identificar el tipo de objeto
            if (c instanceof Pelicula) tipo = "[PELÍCULA]";
            else if (c instanceof Documental) tipo = "[DOCUMENTAL]";
            else if (c instanceof SerieDeTV) tipo = "[SERIE TV]";
            else if (c instanceof Streaming) tipo = "[STREAMING]";
            else if (c instanceof Publicidad) tipo = "[PUBLICIDAD]";
            
            System.out.println(tipo + " Título: " + c.getTitulo() + " | Género: " + c.getGenero());
        }
    }
}