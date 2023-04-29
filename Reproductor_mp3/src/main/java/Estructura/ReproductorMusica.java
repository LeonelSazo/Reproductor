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
public class ReproductorMusica {
    
    
    
    
    
     void insertar(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean estaVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String quitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
    
   
    private static class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    
    
    
    
    
    
    
    
    

    public static class Cola {
        Nodo cabeza;
        Nodo cola;

        Cola() {
            this.cabeza = null;
            this.cola = null;
        }

        boolean estaVacia() {
            return this.cabeza == null;
        }

        void insertar(String dato) {
            Nodo nuevo = new Nodo(dato);
            if (estaVacia()) {
                this.cabeza = nuevo;
                this.cola = nuevo;
            } else {
                this.cola.siguiente = nuevo;
                this.cola = nuevo;
            }
        }

        String quitar() {
            if (estaVacia()) {
                return null;
            }
            String dato = this.cabeza.dato;
            this.cabeza = this.cabeza.siguiente;
            if (this.cabeza == null) {
                this.cola = null;
            }
            return dato;
        }
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        // Obtener los archivos de música de una carpeta
//        File carpetaMusica = new File("C:\\Users\\Leonel\\Desktop\\ListaReproductor");
//        File[] archivosMusica = carpetaMusica.listFiles((dir, name) -> name.endsWith(".mp3"));
//        // Ordenar los archivos alfabéticamente
//        Arrays.sort(archivosMusica);
//
//        // Crear la cola y agregar los archivos a ella
//        Cola listaMusica = new Cola();
//        for (File archivo : archivosMusica) {
//            listaMusica.insertar(archivo.getName());
//        }
//
//        // Desapilar cada elemento de la cola y reproducir la música
//        while (!listaMusica.estaVacia()) {
//            String archivo = listaMusica.quitar();
//            System.out.println("Reproduciendo " + archivo);
//            // código para reproducir el archivo de música
//        }
//    }
    
}
