/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  adsfkjshdfjksdh
 */
package ejercicio1;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Genero> generos = new ArrayList<>();
        List<PaisDeOrigen> paisesDeOrigen = new ArrayList<>();
        List<Calificacion> calificaciones = new ArrayList<>();

        List<Pelicula> peliculas = new ArrayList<>();
        
        // Cargar una lista desde teclado
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String generoStr;  
        System.out.println("Ingrese genero: ");
        try {
            do {
                generoStr = br.readLine();
                if(!generoStr.equals("FIN")){
                    Genero gen = new Genero(generoStr);
                    generos.add(gen);
                }
            } while (!generoStr.equals("FIN"));
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        String generosArray[] = {"DRAMA","ACCION","SUSPENSO","TERROR"};//new String[10];
        for (int i = 0; i < generosArray.length; ++i) {
            generos.add(new Genero(generosArray[i]));
        }
        String calificacionArray[] = {"MUY MALA","MALA","BUENA","MUY BUENA"};//new String[10];
        for (int i = 0; i < calificacionArray.length; ++i) {
            calificaciones.add(new Calificacion(calificacionArray[i]));
        }
        String paisDeOrigenArray[] = {"USA-EN","ARGENTINA-ES"};//new String[10];
        for (int i = 0; i < paisDeOrigenArray.length; ++i) {
            String data[] = paisDeOrigenArray[i].split("-");
            paisesDeOrigen.add(new PaisDeOrigen(data[1],data[0]));
        }
        String peliculasArray[] = {"Los pitufos 3","Furius 8", "La bella y la bestia"};//new String[10];
        for (int i = 0; i < peliculasArray.length; ++i) {
            peliculas.add(new Pelicula(peliculasArray[i]));
        }
        
        
/*        
        
        // Mostrar contenido de una lista
        Iterator<Genero> iter1 = generos.iterator();
        System.out.println("Generos:");
        while (iter1.hasNext()) {
            Genero gen = iter1.next();
            System.out.println(gen.getNombre());
        }        
        Iterator<Calificacion> iter2 = calificaciones.iterator();
        System.out.println("Calificaciones:");
        while (iter2.hasNext()) {
            Calificacion gen = iter2.next();
            System.out.println(gen.getNombre());
        }        
        Iterator<PaisDeOrigen> iter3 = paisesDeOrigen.iterator();
        System.out.println("PaisesDeOrigen:");
        while (iter3.hasNext()) {
            PaisDeOrigen gen = iter3.next();
            System.out.println(gen.getNombre());
        }        
*/
        boolean peliculaExiste = false;
        Pelicula peli = new Pelicula();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombreStr;  
        System.out.println("Ingrese nombre de la pelicula: ");
        try {
            nombreStr = br.readLine();

            System.out.println("Buscando pelicula ...... ");
            Iterator<Pelicula> iter0 = peliculas.iterator();
            while (iter0.hasNext()) {
                Pelicula p = iter0.next();
                String nombre = p.getNombrePelicula();
                if(nombre.equals(nombreStr)){
                    peliculaExiste = true;
                }
            }        
            if(!peliculaExiste){
                peli.setNombrePelicula(nombreStr);
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        if(!peliculaExiste){

            String duracionStr;  
            System.out.println("Ingrese duracion: ");
            try {
                duracionStr = br.readLine();
                if(duracionStr != null){
                    int duracionInt = Integer.parseInt(duracionStr);
                    peli.setDuracion(duracionInt);
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }

            String tituloOriginalStr;  
            System.out.println("Ingrese el titulo original: ");
            try {
                tituloOriginalStr = br.readLine();
                if(tituloOriginalStr != null){
                    peli.setTituloOriginal(tituloOriginalStr);
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }

            String anioEstrenoStr;  
            System.out.println("Ingrese el año de estreno: ");
            try {
                anioEstrenoStr = br.readLine();
                if(anioEstrenoStr != null){
                    int anioEstrenoInt = Integer.parseInt(anioEstrenoStr);
                    peli.setAnioEstreno(anioEstrenoInt);
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("La pelicula es:" + peli.getNombrePelicula());  
            System.out.println("Titulo original:" + peli.getTituloOriginal());  
            System.out.println("Duracion:" + peli.getDuracion());  
            System.out.println("Alo de estreno:" + peli.getAnioEstreno());  
    /*
            //System.out.println("Genero de la pelicula:" + peli.getGenero());
            System.out.println("Pais de la pelicula:" + peli.getPaisDeOrigen().getNombre());
            System.out.println("Pais de la pelicula:" + peli.getPaisDeOrigen());
            System.out.println("Calificacion de la pelicula:" + peli.getCalificacion());
    */

        } else {
            System.out.println("La pelicula ya existe!!");
        }


    }
    
}
