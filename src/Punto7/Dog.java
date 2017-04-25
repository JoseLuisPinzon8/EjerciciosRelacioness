/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;

/**
 *
 * @author JoseLuis
 */
public class Dog extends Pet{
private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
    }
    
    @Override
    public String sound(){
        return "guau";
    }
    
    @Override
    public String datos(){
    return "La mascota es un perro y se llama: " + this.name + ". Su id es: " + this.id + 
            ". Su color de pelo es: " + this.hairColor + ". Su raza es: " + this.breed;
    }
}
