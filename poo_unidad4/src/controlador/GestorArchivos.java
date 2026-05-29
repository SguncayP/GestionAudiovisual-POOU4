package controlador;

import modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivos {

    /**
     * Carga los datos desde un archivo CSV y retorna una lista de objetos.
     */
    public List<ContenidoAudiovisual> cargarDesdeCSV(String ruta) {
        List<ContenidoAudiovisual> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            // Saltamos la fila de encabezados para evitar errores al convertir números
            br.readLine(); 
            
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue; // Salta líneas vacías
                
                ContenidoAudiovisual obj = crearObjetoDesdeLinea(linea);
                if (obj != null) {
                    lista.add(obj);
                }
            }
            System.out.println("Archivo procesado exitosamente.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado en " + ruta);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

    /**
     * Factory Method que instancia objetos basados en el tipo de contenido.
     */
    private ContenidoAudiovisual crearObjetoDesdeLinea(String linea) {
        String[] d = linea.split(",");
        
        try {
            // Limpiamos los datos de espacios en blanco
            String tipo = d[0].trim();
            String titulo = d[1].trim();
            int duracion = Integer.parseInt(d[2].trim());
            String genero = d[3].trim();

            switch (tipo) {
                case "Pelicula":
                    return new Pelicula(titulo, duracion, genero, d[4].trim(), null);
                case"Publicidad":
                	return new Publicidad(titulo,duracion,genero,d[4].trim(),null);
                case "Documental":
                    return new Documental(titulo, duracion, genero, d[4].trim(), null);
                case "SerieDeTV":
                    return new SerieDeTV(titulo, duracion, genero);
                case "Streaming":
                    // Verificamos que tenga suficientes columnas para el precio
                    if (d.length < 6) return null;
                    return new Streaming(titulo, duracion, genero, d[4].trim(), Double.parseDouble(d[5].trim()));
                default:
                    System.out.println("Tipo desconocido: " + tipo);
                    return null;
            }
        } catch (Exception e) {
            System.err.println("Error procesando línea: " + linea + " | Motivo: " + e.getMessage());
            return null;
        }
    }

    /**
     * Guarda la lista de contenidos en un archivo CSV.
     */
    public void guardarEnCSV(String ruta, List<ContenidoAudiovisual> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            // Escribimos el encabezado
            bw.write("Tipo,Titulo,Duracion,Genero,Extra1,Precio");
            bw.newLine();
            
            for (ContenidoAudiovisual c : lista) {
                String linea = c.getClass().getSimpleName() + "," + 
                               c.getTitulo() + "," + 
                               c.getDuracionEnMinutos() + "," + 
                               c.getGenero();
                
                // Si es necesario, añade aquí la lógica para guardar atributos extra
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Datos guardados exitosamente en: " + ruta);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}