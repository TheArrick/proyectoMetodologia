/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.organizadordetareas.Controlador;

import java.util.*;

/**
 * La clase Tarea representa una tarea pendiente y extiende la clase Pendiente.
 * Además, implementa la interfaz Comparable para comparar tareas por prioridad.
 */
public class Tarea extends Pendiente implements Comparable<Tarea> {

    // Constructores de la clase Tarea
    /**
     * Constructor de Tarea con todos los parámetros.
     *
     * @param titulo El título de la tarea.
     * @param descripcion La descripción de la tarea.
     * @param hora La hora de la tarea.
     * @param fecha La fecha de la tarea.
     * @param prioridad La prioridad de la tarea.
     */
    /**
     * Constructor de Tarea con título, hora, fecha y prioridad.
     *
     * @param titulo El título de la tarea.
     * @param hora La hora de la tarea.
     * @param fecha La fecha de la tarea.
     * @param prioridad La prioridad de la tarea.
     */
    private ArrayList<String> subTareas;

    public Tarea(String titulo, Hora hora, Fecha fecha, int prioridad) {
        super(titulo, "", hora, fecha, prioridad);
        subTareas = new ArrayList<String>();
    }

    public ArrayList<String> getSubTareas() {
        return subTareas;
    }

    //metodo para añadir subTareas a una tarea
    public void addSubTarea(String st) {
        subTareas.add(st);
    }

    //metodo que devuelve el toString de las subtareas 
    //separadas por un caracter que es '*'
    public String toStringSubT() {
        String res = "";
        for (int i = 0; i < subTareas.size(); i++) {
            res += subTareas.get(i);
            if (i != subTareas.size() - 1) {
                res += "*";
            }
        }
        return res;
    }

    //metodo para eliminar una subtarea dado el indice de la subtarea
    public boolean eliminarSubT(int i) {
        boolean res = false;
        if (i != -1) {
            subTareas.remove(i);
            res = true;
        }
        return res;
    }
    

    /**
     * Devuelve una representación en cadena de la tarea.
     *
     * @return La representación en cadena de la tarea.
     */
    @Override
    public String toString() {
        return titulo + "|" + hora.toStringSerializado() + "|" + fecha.toStringSerializado() + "|" + prioridad + "|" + seRepite() + "|" + toStringSubT();
    }
    
    
    public ArrayList<String> getSubtareas(){
        return subTareas;
    }
    
    
    public String toStringSubs(){
        String res  = "";
        for(int i = 0 ; i< subTareas.size(); i++){
            res = res + subTareas.get(i) + "\n";
        }
        return res;
    }
    //Implementacion de getHORA Y getFecha para la implementacion de no tener tareas con fechas repetidads
    public Hora getHora() {
        return hora;
    }

    //lo mismo para fecha
    public Fecha getFecha() {
        return fecha;
    }
    // Métodos de la clase Tarea

    /**
     * Establece el título de la tarea.
     *
     * @param str El nuevo título de la tarea.
     */
    public void setTitulo(String str) {
        titulo = str;
    }

    public void setFecha(Fecha f) {
        fecha = f;
    }

    public void setHora(Hora h) {
        hora = h;
    }

    /**
     * Obtiene el título de la tarea.
     *
     * @return El título de la tarea.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece la prioridad de la tarea.
     *
     * @param n La nueva prioridad de la tarea.
     */
    public void setPrioridad(int n) {
        prioridad = n;
    }

    /**
     * Obtiene la prioridad de la tarea.
     *
     * @return La prioridad de la tarea.
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Compara esta tarea con otra tarea basada en su prioridad.
     *
     * @param e La tarea a comparar.
     * @return Un entero negativo si esta tarea tiene mayor prioridad que la
     * tarea dada, cero si tienen la misma prioridad, o un entero positivo si
     * esta tarea tiene menor prioridad que la tarea dada.
     */
    @Override
    public int compareTo(Tarea e) {
        int res = 1;
        if (this == e) {
            res = 0;
        } else if (prioridad > e.prioridad) {
            res = -1;
        }
        return res;
    }

    /**
     * Muestra la información de la tarea.
     *
     * @return Una cadena con la información de la tarea.
     */
    public String mostrar() {
        return "Título: " + titulo + "\nA las: " + hora.toString() + "\nEn la fecha: " + fecha.toString() + "\nY con prioridad de: " + prioridad;
    }

    /**
     * Verifica si la tarea se repite.
     *
     * @return true si la tarea se repite, false en caso contrario.
     */
    public boolean seRepite() {
        return true;
    }
}
