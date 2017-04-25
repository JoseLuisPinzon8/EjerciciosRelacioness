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
public class Sala {
private String nomSala;
private ArrayList<Semana>semanas;

public Sala(String nomSala,ArrayList<Semana> semanas) {
	super();
	this.semanas = semanas;
	this.nomSala= nomSala;
}

public ArrayList<Semana> getSemanas() {
	return semanas;
}

public void setSemanas(ArrayList<Semana> semanas) {
	this.semanas = semanas;
}

public String getNomSala() {
	return nomSala;
}

public void setNomSala(String nomSala) {
	this.nomSala = nomSala;
}
    
}
