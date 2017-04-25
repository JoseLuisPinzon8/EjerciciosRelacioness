/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.ArrayList;

public class mainCarros {
    
    public static void main(String[] args) {
		
Motor motor1= new Motor(5000);
Motor motor2= new Motor(1200);
Rueda[] rueda1= new Rueda [4];

    for (int i = 0; i < rueda1.length; i++) {
	
	rueda1[i]=new Rueda("lluvia");
	
    }
    
Carro bmw= new Carro("azul","convertible","PQEK",rueda1,motor1);
Carro renault4 = new Carro("verde","clasico","CDC",rueda1,motor2);
ArrayList<Carro> coleccion1=new ArrayList<Carro>() ;

coleccion1.add(bmw);
coleccion1.add(renault4);

Persona persona1=new Persona("Pablito",coleccion1);
persona1.datos();
	}
} 

