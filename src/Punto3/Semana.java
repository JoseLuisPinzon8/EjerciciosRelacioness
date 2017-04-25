/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Semana {
private int numero;
private ArrayList<Sala>salas;
private Dia dia;
private Dia[] diasHabiles;
public Semana(int numero, ArrayList<Sala> salas, Dia[] diasHabiles) {
	super();
	this.numero = numero;
	this.salas = salas;
	this.diasHabiles = diasHabiles;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public ArrayList<Sala> getSalas() {
	return salas;
}
public void setSalas(ArrayList<Sala> salas) {
	this.salas = salas;
}
public Dia[] getDiasHabiles() {
	return diasHabiles;
}
public void setDiasHabiles(Dia[] diasHabiles) {
	this.diasHabiles = diasHabiles;
}
public String diashabiles(int i){
	return diasHabiles[i].getFecha().getTime()+" dia: "+diasHabiles[i].getNombre()+" hora inicio: "
    +diasHabiles[i].getSegmentos().get(i).getHoraDeInicio()+" hora finalizacion "+diasHabiles[i].getSegmentos().get(i).getHoraDeFinalizacion();
}    
}
