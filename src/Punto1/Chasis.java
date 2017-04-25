/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author JoseLuis
 */
public class Chasis {
private String material;
private String modelo;
public Chasis(String material, String modelo) {
	
	this.material = material;
	this.modelo = modelo;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
}

