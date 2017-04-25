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
public class PetException extends Exception{
    public PetException(){
        super("La mascota elegida no es correcta, por favor lija entre cat, dog o hamster");        
    }
}
