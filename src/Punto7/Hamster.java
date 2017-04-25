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
public class Hamster extends Pet{
private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
    }
    
    @Override
    public String sound(){
        return "snif";
    }
    
    @Override
    public String datos(){
    return "La mascota es un hamster y se llama: " + this.name + ". Su id es: " + this.id 
            +". Su color de pelo es: " + this.hairColor + ". Y su peso es: " + this.weight;
    }
}
