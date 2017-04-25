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
public class Cat extends Pet{
private boolean  isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }
    
    @Override
    public String sound(){
        return "miau";
    }
    
    @Override
    public String datos(){
        String a;
        if(isHunter==true){
            a="es";
        }else{
            a="no es";
        }
    return "La mascota es un gato y se llama: " + this.name + ". Su id es: " + this.id +
            ". Su color de pelo es: " + this.hairColor + ". Y " + a + " cazador"; 
    }
}
