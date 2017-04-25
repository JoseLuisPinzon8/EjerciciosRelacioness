/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author JoseLuis
 */
public class Segmento {
private String horaDeInicio;
private String horaDeFinalizacion;
public Segmento(String horaDeInicio, String horaDeFinalizacion) {
	
	this.horaDeInicio = horaDeInicio;
	this.horaDeFinalizacion = horaDeFinalizacion;
}
public String getHoraDeInicio() {
	return horaDeInicio;
}
public void setHoraDeInicio(String horaDeInicio) {
	this.horaDeInicio = horaDeInicio;
}
public String getHoraDeFinalizacion() {
	return horaDeFinalizacion;
}
public void setHoraDeFinalizacion(String horaDeFinalizacion) {
	this.horaDeFinalizacion = horaDeFinalizacion;
}  
}
