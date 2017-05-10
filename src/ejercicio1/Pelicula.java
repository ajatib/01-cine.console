/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;


/**
 *
 * @author Alumno
 */
public class Pelicula {
    private String nombrePelicula;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String tituloOriginal;
    
    private Genero genero;
    private PaisDeOrigen paisDeOrigen;
    private Calificacion calificacion;
    

    public Calificacion getCalificacion(){
        return this.calificacion;
    }
    
    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }    
    
    public PaisDeOrigen getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    
    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }    
    
    /**
    * get genero
    * @param genero
    */    
    public Genero getGenero(){
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public String getNombrePelicula(){
        return this.nombrePelicula;
    }
    
    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }
    
    public int getAnioEstreno() {
        return this.anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) { 
        if(duracion > 20 && duracion < 200){
            this.duracion = duracion;
        } else {
            System.out.println("Error en duracion");
        }
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTituloOriginal() {
        return this.tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    
    
    
    // Constructor
    public Pelicula(){
    }
    public Pelicula(String nombre){
        //System.out.println("estoy en el constructor y el nombres es:" + nombre);
        this.setNombrePelicula(nombre);
    }



    
}