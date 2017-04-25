/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Categoria extends ObjetoDeDominio{
private String nombre;
private String descripcion;
private ArrayList<Producto>productos;

public Categoria(String id,String nombre, String descripcion){
	super (id);
	this.nombre= nombre;
	this.descripcion=descripcion;
}
public void crearProductos(){
	this.productos= new ArrayList<Producto>();
}
public void añadirProductos(Producto producto){
	productos.add(producto);
}
public String getNombre() {
	return nombre;
}
public String getDescripcion() {
	return descripcion;
}
public ArrayList<Producto> getProductos() {
	return productos;
}
public String informacion(){
	for (int i = 0,j=0; i<3; j++) {
		if(j==3){
			i++;
			j=0;
		}
		if(i==3){
			break;
		}
		System.out.println("Id: "+getId()+" Categoria: "+getNombre()+" Descripcion: "+getDescripcion()+" productos: "+
		productos.get(i).getId()+" descripcion "+productos.get(i).getDescripcion()+ "\n id "+
		productos.get(i).getArticulos().get(j).getId()+ " nombre "+productos.get(i).getArticulos().get(j).getNombre()+ " unidad costo "+
		productos.get(i).getArticulos().get(j).getCostoUnitario());
		
	}
	return " ";
}    
}
