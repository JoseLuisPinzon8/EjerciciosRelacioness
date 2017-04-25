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
public class Cliente extends ObjetoDeDominio{
private String primerNombre;
private String ultimoNombre;
private	String telefono;
private String calle1;
private String calle2;
private String ciudad;
private String pais;
private String codigoPostal;

public Cliente(String id, String primerNombre, String ultimoNombre, String telefono, String calle1, String calle2,
		String ciudad, String pais, String codigoPostal) {
	super(id);
	this.primerNombre = primerNombre;
	this.ultimoNombre = ultimoNombre;
	this.telefono = telefono;
	this.calle1 = calle1;
	this.calle2 = calle2;
	this.ciudad = ciudad;
	this.pais = pais;
	this.codigoPostal = codigoPostal;
}

public String getPrimerNombre() {
	return primerNombre;
}

public String getUltimoNombre() {
	return ultimoNombre;
}

public String getTelefono() {
	return telefono;
}

public String getCalle1() {
	return calle1;
}

public String getCalle2() {
	return calle2;
}

public String getCiudad() {
	return ciudad;
}

public String getPais() {
	return pais;
}

public String getCodigoPostal() {
	return codigoPostal;
}    
}
