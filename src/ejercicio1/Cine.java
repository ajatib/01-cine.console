/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Cine {
    
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private BigDecimal precioEntrada;
    
    //private List<Sala> salas;
    //private List<HorarioFuncion> horariosFunciones;
    //private List<Programacion> programaciones;

    /**
     * Constructor por Defecto
     */
    public Cine() {
        /*salas = new ArrayList<>();
        horariosFunciones = new ArrayList<>();
        programaciones = new ArrayList<>();
        */
    }

    
    /**
     * Este constructor no incluye los atributos referenciales de la clase Cine
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre 
     * @param precioEntrada 
     */
    public Cine(String direccion, Date fechaInauguracion, String nombre, BigDecimal precioEntrada) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        
        // inicializamos las colecciones vacias
        //this.salas = new ArrayList<>();
        //this.horariosFunciones = new ArrayList<>();
        //this.programaciones = new ArrayList<>();
    }
    
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaInauguracion() {
        return this.fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(BigDecimal precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    /*
    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<HorarioFuncion> getHorariosFunciones() {
        return horariosFunciones;
    }

    public void setHorariosFunciones(List<HorarioFuncion> horariosFunciones) {
        this.horariosFunciones = horariosFunciones;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }
*/
        
}
