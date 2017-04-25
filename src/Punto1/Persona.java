/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.ArrayList;

public class Persona {   
private String nombre;
//la siguiente linea es una relacion de array entre la clase persona y la clase carro
private ArrayList<Carro> numCarros;

public ArrayList<Carro> getNumCarros() {
        return numCarros;
}

@Override
public String toString() {
        return "Persona [nombre=" + nombre + ", numCarros=" + numCarros + "]";
}

public void setNumCarros(ArrayList<Carro> numCarros) {
        this.numCarros = numCarros;
}

public Persona(String nombre, ArrayList<Carro> numCarros) {
        this.nombre = nombre;
        this.numCarros = numCarros;
}

public String getNombre() {
        return nombre;
}

public void setNombre(String nombre) {
        this.nombre = nombre;
}

public void datos(){
        for (int i = 0; i < numCarros.size(); i++) {
                System.out.println("los datos son: "+getNombre()+ " "+numCarros.get(i).datosCarro()); 	
        }

}
}
