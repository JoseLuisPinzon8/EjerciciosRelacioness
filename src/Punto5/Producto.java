/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import Punto5.Articulo;
import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Producto extends ObjetoDeDominio{
private String nombre;
private String descripcion;
private ArrayList<Articulo>articulos;
//preguntar a jose como se hace una relacion en codigo de 0..1
private Categoria categoria;

public Producto(String id,String nombre, String descripcion){
	super(id);
	this.nombre= nombre;
	this.descripcion=descripcion;
}
public Producto(String id,String nombre, String descripcion,Categoria categoria){
	super(id);
	this.nombre= nombre;
	this.descripcion=descripcion;
	this.categoria=categoria;
}


public void crearArticulos(){
	this.articulos= new ArrayList<Articulo>();
}
public void almacenarArticulos(Articulo articulo){
	articulos.add(articulo);
}
public String getNombre() {
	return nombre;
}
public String getDescripcion() {
	return descripcion;
}
public ArrayList<Articulo> getArticulos() {
	return articulos;
}
public Categoria getCategoria() {
	return categoria;
}
    
}
