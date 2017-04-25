/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author JoseLuis
 */
public class Faculty extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Faculty();	
	}
public Faculty(){
	System.out.println("realizar la tarea de la facultad");
}
}
class Employee extends Person{
	public Employee(){
		this("invocar a los empleados");
		System.out.println("realizar la tarea de los empleados");
	}
	public Employee(String s){
		System.out.println(s);
	}
}
class Person{
	public Person(){
		System.out.println("realizar la tareas de las persona");
	}
}
/*la clase Person es la clase padre, la clase Employee hereda de la clase Person y la clase Faculty hereda de la clase Employee
 * y a la ves de la clase Person, entonces si se instancia el constructor de la clase Faculty y este hereda de las otras dos clases
 * automaticamente se llaman los constructores de las otras clases y asi se puede ver los mensajes de los otros constructores de las
 * otras clases.*/    

