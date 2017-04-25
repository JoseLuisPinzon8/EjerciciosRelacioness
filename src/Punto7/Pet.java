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
public class Pet {
protected String id;
protected String name;
protected String hairColor;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }

public String sound(){
    return "sonido";
}

public String datos(){
    return "a";
}
}
