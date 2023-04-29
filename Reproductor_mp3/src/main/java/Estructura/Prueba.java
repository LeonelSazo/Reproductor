/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Leonel
 */
public class Prueba {
    public static void main(String[] args) {
        // Obtener los archivos de música de una carpeta
        File carpetaMusica = new File("C:\\Users\\Leonel\\Desktop\\ListaReproductor");
        File[] archivosMusica = carpetaMusica.listFiles((dir, name) -> name.endsWith(".mp3"));
        // Ordenar los archivos alfabéticamente
        Arrays.sort(archivosMusica);

        // Crear la cola y agregar los archivos a ella
        ReproductorMusica.Cola listaMusica = new ReproductorMusica.Cola();
        for (File archivo : archivosMusica) {
            listaMusica.insertar(archivo.getName());
        }

        // Desapilar cada elemento de la cola y reproducir la música
        while (!listaMusica.estaVacia()) {
            String archivo = listaMusica.quitar();
            System.out.println("Reproduciendo " + archivo);
            // código para reproducir el archivo de música
        }
    }
}
