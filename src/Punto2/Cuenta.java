/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class Cuenta {
private int numeroCuenta;
private double saldoActual;
private GregorianCalendar fechaCreacion;
private String nomCliente;
private ArrayList <Movimiento> movimientos;
GregorianCalendar calendario= new GregorianCalendar();

public Cuenta(int numeroCuenta, double saldoActual, GregorianCalendar fechaCreacion, String nomCliente) {
	super();
	this.numeroCuenta = numeroCuenta;
	this.saldoActual = saldoActual;
	this.fechaCreacion = fechaCreacion;
	this.nomCliente = nomCliente;
	//this.movimientos= new ArrayList<Movimiento>();
}

public void adicionarMovimientos(){
	this.movimientos= new ArrayList<Movimiento>();
}
public void añadirObjeto(Movimiento movi){
	movimientos.add(movi);
}
public void fechas(){
	for(int i=0;i<movimientos.size();i++){
		System.out.println(movimientos.get(i).getTipo().getCodigo());
	}
}
public int getNumeroCuenta() {
	return numeroCuenta;
}
public void setNumeroCuenta(int numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}
public double getSaldoActual() {
	return saldoActual;
}
public void setSaldoActual(double saldoActual) {
	this.saldoActual = saldoActual;
}

public String getNomCliente() {
	return nomCliente;
}
public void setNomCliente(String nomCliente) {
	this.nomCliente = nomCliente;
}
public ArrayList<Movimiento> getMovimientos() {
	return movimientos;
}
public void setMovimientos(ArrayList<Movimiento> movimientos) {
	this.movimientos = movimientos;
}

public GregorianCalendar getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(GregorianCalendar fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
} 
    
}
