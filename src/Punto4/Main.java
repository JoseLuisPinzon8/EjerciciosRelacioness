/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class Main {
    
    public static void main(String[] args){
        
        String nombre = "Jose";
        int day=6;
        int month=11;
        int year=1998;
        Date fecha = new Date(day,month,year);
        Persona p1 = new Persona(fecha,nombre);
        GregorianCalendar cal=new GregorianCalendar(year,month-1,day);        
        cal.getTime();

        System.out.println("La fecha de nacimiento de " + p1.getNombre());
        System.out.println(cal.getTime());
        if(cal.isLeapYear(year)==true){
            System.out.println("El ano " + year + " es bisiesto");
        }
        else{
            System.out.println("El ano " + year + " no es bisisesto");
        }
    }
    
}
