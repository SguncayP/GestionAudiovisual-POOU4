Sistema de Gestión de Contenido Audiovisual - POO U4

Este proyecto es una aplicación desarrollada en Java para la gestión y organización de contenidos audiovisuales (Películas, Series de TV, Documentales, etc.). El sistema implementa una arquitectura robusta basada en el patrón MVC (Modelo-Vista-Controlador) y aplica principios de código limpio (Clean Code) y SOLID para garantizar la escalabilidad y mantenibilidad del software.

🚀 Características Principales
Patrón MVC: Separación clara entre la lógica de negocio (Modelo), la interfaz de usuario (Vista) y el flujo de control (Controlador).  

Manejo de Archivos: Persistencia de datos mediante lectura y escritura en archivos CSV, permitiendo cargar y guardar el estado actual del sistema.

Principios SOLID: Código diseñado para ser modular, facilitando la extensión del sistema (ej. agregar nuevas entidades) sin modificar el núcleo funcional.  

Pruebas Unitarias: Suite completa de pruebas en JUnit que asegura la calidad y fiabilidad de cada clase del modelo
 
 Estructura del ProyectoPlaintextsrc/
 
├── controlador/     # Lógica de gestión y persistencia (GestorArchivos, ControladorAudiovisual)

├── modelo/          # Entidades (Pelicula, SerieDeTV, Documental, Actor, etc.)

├── principal/       # Clase Main punto de entrada

└── vista/           # Interfaz de usuario (MenuPrincipal)

test/                # Pruebas unitarias JUnit para validación del modelo


🛠️ Requisitos

Java Development Kit (JDK) 11 o superior.

IDE Eclipse.

JUnit 6.

📥 Instrucciones de EjecuciónClonar el repositorio:

Bashgit clone [https://github.com/SguncayP/GestionAudiovisual-POO]

Importar en Eclipse:Ve a File > Import > General > Existing Projects into Workspace.Selecciona la carpeta del proyecto.

Ejecutar la aplicación: Navega al paquete principal y ejecuta la clase Main.java.

Ejecutar las pruebas: Haz clic derecho sobre la carpeta test > Run As > JUnit Test.


👤 AutorSergio Guncay - Universidad Politécnica Salesiana. 
