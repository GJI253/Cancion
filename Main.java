/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.mycompany.cancion;

/**
 *
 * @author genesis
 */
public class Main {
  
    public static void main (String[]args){
        Playlist p = new Playlist ("Rock");
        
        p.agregarCancion ( new Cancion ("Numb","Linkin Park",200));
        
        p.agregarCancion (new Cancion ("Bohemian Rhapsody"," Qeen" ,350));
        
        p.agregarCancion (new Cancion ("Enter Sandam"," Mallica",330));
        
        p.mostrarPlaylist();
       System.out.println("Existe Numb: " + p. buscarCancion ("Numb"));
        
        Cancion larga = p.cancionMasLarga();
        System.out.println("Cancion mas larga:" + larga.titulo);
    }
    
}
    

