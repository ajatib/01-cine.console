/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Programacion {
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaHoraCreada;
    //private List<Funcion> funciones;

    /**
     * Constructor por Defecto
     */
    public Programacion() {
        //funciones = new ArrayList<>();
    }

    /**
     * Este constructor todos los atributos de la clase Programacion
     * 
     * @param fechaInicio
     * @param fechaFin
     * @param fechaHoraCreada
     * @param funciones 
     */
    public Programacion(Date fechaInicio, Date fechaFin, Date fechaHoraCreada) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        //this.funciones = funciones;
        //this.funciones = new ArrayList<>();
    }
      
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    /*
    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    */
 
    @Override
    public String toString() {
        return "Programacion{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaHoraCreada=" + fechaHoraCreada + "}"; //, funciones=" + funciones + '}';
    }
        
}
