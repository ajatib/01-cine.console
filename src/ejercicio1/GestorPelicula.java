/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class GestorPelicula {
    private String nombrePelicula;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String tituloOriginal;
    
    private Genero genero;
    private PaisDeOrigen paisDeOrigen;
    private Calificacion calificacion;

    private List<Genero> generos;
    private List<PaisDeOrigen> paisesDeOrigen;
    private List<Calificacion> calificaciones;
    
    private Pelicula pelicula;
    
    private List<Pelicula> peliculas;
    
    private int opcion;
    
    public GestorPelicula() {

        this.generos = this.cargarGeneros();
        this.calificaciones = this.cargarCalificaciones();
        this.paisesDeOrigen = this.cargarPaisesDeOrigen();
        
        this.peliculas = this.cargarPeliculas();

        do {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String opcionStr;  
            System.out.println("Complejo de cines: ");
            System.out.println("1 - Listar peliculas");
            System.out.println("2 - Registrar nueva pelicula");
            System.out.println("3 - Salir");
            System.out.println("Seleccione una opcion");
            try {
                opcionStr = br.readLine();
                if(opcionStr != null){
                    this.opcion = Integer.parseInt(opcionStr);
                }
            } catch (Exception ex) {
                System.out.println("Error" + ex.getMessage());
            }

            switch(this.opcion){
                case 1:
                    
                    this.listarPeliculas();
                    break;
                case 2:
                    // Registrar pelicula
                    boolean peliculaExiste = false;
                    this.pelicula = new Pelicula();

                    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String nombreStr;  
                    System.out.println("Ingrese nombre de la pelicula: ");
                    try {
                        nombreStr = br.readLine();

                        peliculaExiste = this.buscarPelicula(nombreStr);
                        if(!peliculaExiste){
                            this.pelicula.setNombrePelicula(nombreStr);
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }


                    if(!peliculaExiste){

                        String duracionStr;  
                        System.out.println("Ingrese duracion: ");
                        try {
                            duracionStr = br.readLine();
                            if(duracionStr != null){
                                int duracionInt = Integer.parseInt(duracionStr);
                                this.pelicula.setDuracion(duracionInt);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        String tituloOriginalStr;  
                        System.out.println("Ingrese el titulo original: ");
                        try {
                            tituloOriginalStr = br.readLine();
                            if(tituloOriginalStr != null){
                                this.pelicula.setTituloOriginal(tituloOriginalStr);
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
                                this.pelicula.setAnioEstreno(anioEstrenoInt);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
                        }




                        String generoStr;  
                        System.out.println("Genero:");
                        Iterator<Genero> iter1 = generos.iterator();
                        int i1 = 1;
                        while (iter1.hasNext()) {
                            Genero gen = iter1.next();
                            System.out.println(i1 + " - " +gen.getNombre());
                            i1++;
                        }              
                        System.out.println("Seleccione: ");
                        try {
                            generoStr = br.readLine();
                            if(generoStr != null){
                                int generoInt = Integer.parseInt(generoStr);
                                Genero gen = generos.get(generoInt - 1);
                                this.pelicula.setGenero(gen);
                            }
                        } catch (Exception ex) {
                            System.out.println("Error" + ex.getMessage());
                        }


                        String calificacionStr;  
                        System.out.println("Calificacion:");
                        Iterator<Calificacion> iter2 = calificaciones.iterator();
                        int i2 = 1;
                        while (iter2.hasNext()) {
                            Calificacion cal = iter2.next();
                            System.out.println(i2 + " - " +cal.getNombre());
                            i2++;
                        }              
                        System.out.println("Seleccione: ");
                        try {
                            calificacionStr = br.readLine();
                            if(calificacionStr != null){
                                int calificacionInt = Integer.parseInt(calificacionStr);
                                Calificacion cal = calificaciones.get(calificacionInt - 1);
                                this.pelicula.setCalificacion(cal);
                            }
                        } catch (Exception ex) {
                            System.out.println("Error" + ex.getMessage());
                        }


                        String paisDeOrigenStr;  
                        System.out.println("Calificacion:");
                        Iterator<PaisDeOrigen> iter3 = paisesDeOrigen.iterator();
                        int i3 = 1;
                        while (iter3.hasNext()) {
                            PaisDeOrigen pais = iter3.next();
                            System.out.println(i3 + " - " +pais.getNombre());
                            i3++;
                        }              
                        System.out.println("Seleccione: ");
                        try {
                            paisDeOrigenStr = br.readLine();
                            if(paisDeOrigenStr != null){
                                int paisDeOrigenInt = Integer.parseInt(paisDeOrigenStr);
                                PaisDeOrigen pais = paisesDeOrigen.get(paisDeOrigenInt - 1);
                                this.pelicula.setPaisDeOrigen(pais);
                            }
                        } catch (Exception ex) {
                            System.out.println("Error" + ex.getMessage());
                        }            





                        this.mostrarPelicula();
                        
                        this.guardarPelicula();

                    } else {
                        System.out.println("La pelicula ya existe!!");
                    }        
                    
                    break;
                case 3:
                    System.out.println("Saliendo del programa....");
                    break;
            }

        } while (this.opcion != 3);
    }
    
    public boolean buscarPelicula(String nombrePelicula){
        System.out.println("Buscando pelicula ...... ");
        Iterator<Pelicula> iter = peliculas.iterator();
        while (iter.hasNext()) {
            Pelicula p = iter.next();
            String nombre = p.getNombrePelicula();
            if(nombre.equals(nombrePelicula)){
                return true;
            }
        }               
        return false;
    }
    
    public void listarPeliculas(){
        System.out.println("Lista de peliculas");
        Iterator<Pelicula> iter = this.peliculas.iterator();
        while (iter.hasNext()) {
            Pelicula p = iter.next();
            System.out.println(p.getNombrePelicula() + " - " + p.getGenero() + " - " + p.getAnioEstreno());
        }               
        System.out.println(" ");
    }
    
    public void guardarPelicula(){
        System.out.println("Guardando pelicula ...... ");
        this.peliculas.add(this.pelicula);
        System.out.println(" ");
    }
               
    public void mostrarPelicula(){
        System.out.println("La pelicula es:" + this.pelicula.getNombrePelicula());  

        System.out.println("Genero:" + this.pelicula.getGenero());  
        System.out.println("Calificacion:" + this.pelicula.getCalificacion());  
        System.out.println("Pais de Origen/Idioma:" + this.pelicula.getPaisDeOrigen());  

        System.out.println("Titulo original:" + this.pelicula.getTituloOriginal());  
        System.out.println("Duracion:" + this.pelicula.getDuracion());  
        System.out.println("Alo de estreno:" + this.pelicula.getAnioEstreno());         
    }

    public List<Genero> cargarGeneros(){
        String generosArray[] = {"DRAMA","ACCION","SUSPENSO","TERROR"};//new String[10];
        List<Genero> generos = new ArrayList();
        for (int i = 0; i < generosArray.length; ++i) {
            generos.add(new Genero(generosArray[i]));
        }
        return generos;        
    }

    public List<Calificacion> cargarCalificaciones(){
        String calificacionArray[] = {"MUY MALA","MALA","BUENA","MUY BUENA"};//new String[10];
        List<Calificacion> calificaciones = new ArrayList();
        for (int i = 0; i < calificacionArray.length; ++i) {
            calificaciones.add(new Calificacion(calificacionArray[i]));
        }
        return calificaciones;        
    }

    public List<PaisDeOrigen> cargarPaisesDeOrigen(){
        String paisDeOrigenArray[] = {"USA-EN","ARGENTINA-ES"};//new String[10];
        List<PaisDeOrigen> paisesDeOrigen = new ArrayList();
        for (int i = 0; i < paisDeOrigenArray.length; ++i) {
            String data[] = paisDeOrigenArray[i].split("-");
            paisesDeOrigen.add(new PaisDeOrigen(data[1],data[0]));
        }
        return paisesDeOrigen;        
    }
    
    public List<Pelicula> cargarPeliculas(){
        String peliculasArray[] = {"Los pitufos 3","Furius 8", "La bella y la bestia"};//new String[10];
        List<Pelicula> peliculas = new ArrayList();
        for (int i = 0; i < peliculasArray.length; ++i) {
            peliculas.add(new Pelicula(peliculasArray[i]));
        }
        return peliculas;
    }
}
