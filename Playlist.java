/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.mycompany.cancion;

/**
 *
 * @author Priscila Kennedy
 */
public class Playlist {
     String nombre;
Cancion[] canciones = new Cancion[20];
     int totalCanciones = 0;
public Playlist (String nombre) {
this.nombre = nombre;
} 

    // Ejercicio 1 — agregarCancion
    public void agregarCancion(Cancion c) {
        if (totalCanciones < canciones.length) {
            canciones[totalCanciones] = c;
            totalCanciones++;
        } else {
            System.out.println("Playlist llena");
        }
    }

    // Ejercicio 2 — mostrarPlaylist
    public void mostrarPlaylist() {
        System.out.println("Playlist: " + nombre);
        for (int i = 0; i < totalCanciones; i++) {
            System.out.println((i + 1) + " - " + canciones[i].titulo);
        }
    }

    // Ejercicio 3 — buscarCancion
    public boolean buscarCancion(String titulo) {
        for (int i = 0; i < totalCanciones; i++) {
            if (canciones[i].titulo.equals(titulo)) {
                return true;
            }
        }
        return false;
    }

    // Ejercicio 4 — duración total
    public int duracionTotal() {
        int suma = 0;
        for (int i = 0; i < totalCanciones; i++) {
            suma += canciones[i].duracion;
        }
        return suma;
    }

    // Ejercicio 5 — canción más larga
    public Cancion cancionMasLarga() {
        if (totalCanciones == 0) {
            return null;
        }
        Cancion masLarga = canciones[0];
        for (int i = 1; i < totalCanciones; i++) {
            if (canciones[i].duracion > masLarga.duracion) {
                masLarga = canciones[i];
            }
        }
        return masLarga;
    }
    
    // Ejercicio 6 — Sobrecarga
    public void Cancion(String titulo, String artista, int duracion ){
        Cancion c = new Cancion(titulo, artista, duracion);
        agregarCancion(c);
    }
}    


