/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Funcion {
    private int diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    //private Pelicula pelicula;
    //private Sala sala;
    //private List<Entrada> entradas;

    /**
     * Constructor por Defecto
     */
    public Funcion() {
        //entradas = new ArrayList<Entrada>();
    }
    
    /**
     * Este constructor no incluye los atributos referenciales de la clase Funcion
     * 
     * @param diaSemana
     * @param duracion
     * @param fechaHabilitacion
     * @param horaInicio
     * @param numero
     * @param pelicula
     * @param sala 
     */
    public Funcion(int diaSemana, int duracion, Date horaInicio, int numero) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        //this.pelicula = pelicula;
        //this.sala = sala;
    }
    
    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase
    
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    */
    /**
     * Recorremos las Funciones y armamos una cadena de texto con la 
     * representación de cada una de ellas.
     * 
     * @return cadena de texto con las funciones
     */
    @Override
    public String toString() {
        // TODO recorrer funciones y mostrar sus datos
        return "Datos de la función: " + "Falta de hacer";
    }    
}
