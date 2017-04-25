/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JoseLuis
 */
public class Vet {
private ArrayList<Pet> mascot;

    public Vet(ArrayList<Pet> mascot) {
        this.mascot = mascot;
    }

public void removePet(Pet a){
    this.mascot.remove(a);
}

public String showPetsByType() throws PetException{
    Scanner e = new Scanner (System.in);
    String a = e.next();
    if(a.equals("dog")){
        a = "dog";
    }
    if(a.equals("cat")){
        a = "cat";
    }
    if(a.equals("hamster")){
        a = "hamster";
    }
    return a;
    /*Profe no supe como hacer esto, queria mandar ese valor de "a" a la clase
    final (perro gato o hamstr) para que aplicara el metodo alla segun la 
    entrada del dato pero no supe. La idea era buscar una alternativa
    diferente al hashmap*/
}

public void showPets(){
    for (Pet pet : this.mascot) {
        System.out.println(pet.datos());
    }
} 
}
