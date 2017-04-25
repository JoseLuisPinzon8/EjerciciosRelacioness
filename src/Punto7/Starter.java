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
public class Starter {
    
protected Vet vet;
private Person person;

    public Starter(Vet vet, Person person) {
        this.vet = vet;
        this.person = person;
    }


public static void main (String [] args) throws PetException{
    //ARRAYS DE VETERIANIAS
    ArrayList<Pet> vet1Mascotas = new ArrayList<Pet>();
    ArrayList<Pet> vet2Mascotas = new ArrayList<Pet>();
    //ARRAYS DE PERSONAS
    ArrayList<Pet> p1Mascotas = new ArrayList<Pet>();
    ArrayList<Pet> p2Mascotas = new ArrayList<Pet>();
    ArrayList<Pet> p3Mascotas = new ArrayList<Pet>();
    //VETERINARIAS
    Vet vet1 = new Vet(vet1Mascotas);
    Vet vet2 = new Vet(vet2Mascotas);
    //DUENOS
    Person p1 = new Person ("Julia","123",p1Mascotas);
    Person p2 = new Person ("Jose","122",p2Mascotas);
    Person p3 = new Person ("Cifu","121",p3Mascotas);
    //ANIMALES
    Pet perro1 = new Dog("Labrador","12345","onix","dorado");
    Pet perro2 = new Dog("Labrador","12346","toni","cafe");
    Pet gato1 = new Cat(true,"12347","felix","negro");
    Pet gato2 = new Cat(false,"12348","milo","blanco");
    Pet gato3 = new Cat(true,"12349","mik","negro");
    Pet hamster1 = new Hamster(250.5,"12350","motas","gris");
    Pet hamster2 = new Hamster(244.1,"12351","max","marron");
    Pet hamster3 = new Hamster(212.4,"12352","lahm","blanco");
    Pet hamster4 = new Hamster(232.7,"12353","tom","gris");
    //METODOS 
    //---MASCOTAS DUENO1
    p1Mascotas.add(perro1);
    p1Mascotas.add(gato1);
    p1Mascotas.add(hamster1);
    //---MASCOTAS DUENO2
    p2Mascotas.add(perro2);
    p2Mascotas.add(gato2);
    p2Mascotas.add(gato3);
    //---MASCOTAS DUENO3
    p3Mascotas.add(hamster1);
    p3Mascotas.add(hamster2);
    p3Mascotas.add(hamster3);
    p3Mascotas.add(hamster4);
    //MASCOTAS QUE PERTENECEN A VETERIANAIA 1
    vet1Mascotas.addAll(p3Mascotas);
    vet1Mascotas.addAll(p2Mascotas);
    //MASCOTAS QUE PERTENECEN A VETERIANAIA 2
    vet2Mascotas.addAll(p1Mascotas);
    //METODOS PARA MOSTRAR LOS ANIMALES
    vet1.showPets();
    System.out.println();
    System.out.println();
    vet2.showPets();
    System.out.println();
    System.out.println();
    p1.showPet();
   //METODO PARA BORRAR DE LA VETERINANRIA
    System.out.println();
    vet2.removePet(perro1);
    vet2.showPets();
    //METODO DE INFO DE PERSONAS
    System.out.println();
    p1.showPets();
    //RUIDO DE ANIMALES
    System.out.println(perro1.sound());
    vet1.showPetsByType();
}
}