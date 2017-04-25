/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author JoseLuis
 */
public class Articulo extends ObjetoDeDominio{
private String nombre;
private double costoUnitario;
private Producto producto;

public Articulo(String id, String nombre, double costoUnitario){
	super(id);
	this.nombre=nombre;
	this.costoUnitario=costoUnitario;
	
}
public Articulo(String id, String nombre, double costoUnitario,Producto producto){
	super(id);
	this.nombre=nombre;
	this.costoUnitario=costoUnitario;
	this.producto=producto;
	
}
public String getNombre() {
	return nombre;
}

public double getCostoUnitario() {
	return costoUnitario;
}

public Producto getProducto() {
	return producto;
}    
}
