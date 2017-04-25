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
public class Programacion {
private ArrayList<Sala>salas;

public Programacion(ArrayList<Sala> salas) {
	super();
	this.salas = salas;
}

public ArrayList<Sala> getSalas() {
	return salas;
}

public void setSalas(ArrayList<Sala> salas) {
	this.salas = salas;
}

public String informacion(){
	for(int i=0,j=0,k=0;i<4;i++,k++){
		if(k==2){
			k=0;
		}
		if(i==2){
			j++;
		}
		System.out.println("nombre de sala: "+salas.get(k).getNomSala()+" semana: "+ salas.get(j).getSemanas().get(j).getNumero()+
		" fecha: "+salas.get(j).getSemanas().get(j).diashabiles(i));
	}
	return" ";
}    
}
