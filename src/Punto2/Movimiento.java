/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class Movimiento {
private GregorianCalendar fecha;
private double saldoAnterior;
private double cantidad;
private Tipo tipo;
 
public Movimiento(GregorianCalendar fecha, double saldoAnterior, double cantidad, Tipo tipo) {
	
	this.fecha = fecha;
	this.saldoAnterior = saldoAnterior;
	this.cantidad = cantidad;
	this.tipo = tipo;
}
public GregorianCalendar getFecha() {
	
	return fecha;
}
public void setFecha(GregorianCalendar fecha) {
	this.fecha = fecha;
}
public double getSaldoAnterior() {
	return saldoAnterior;
}
public void setSaldoAnterior(double saldoAnterior) {
	this.saldoAnterior = saldoAnterior;
}
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
public Tipo getTipo() {
	return tipo;
}
public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}
    
}
