/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class Dia {
private GregorianCalendar fecha;
private String nombre;
private ArrayList<Segmento>segmentos;
public Dia(GregorianCalendar fecha, String nombre, ArrayList<Segmento> segmentos) {
	super();
	this.fecha = fecha;
	this.nombre = nombre;
	this.segmentos = segmentos;
}
public GregorianCalendar getFecha() {
	return fecha;
}
public void setFecha(GregorianCalendar fecha) {
	this.fecha = fecha;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public ArrayList<Segmento> getSegmentos() {
	return segmentos;
}
public void setSegmentos(ArrayList<Segmento> segmentos) {
	this.segmentos = segmentos;
} 
}
