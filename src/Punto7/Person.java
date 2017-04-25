/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Person {
private String name;
private String id;
private ArrayList<Pet> pet;

    public Person(String name, String id, ArrayList<Pet> pet) {
        this.name = name;
        this.id = id;
        this.pet = pet;
    }


public void showPet(){
    for (Pet pet1 : this.pet) {
        System.out.println(pet1.datos());
    }
}

public void showPets(){
    System.out.println(this.name + " tiene " + this.pet.size() + " mascotas\n");
}


}
