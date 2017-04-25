/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author JoseLuis
 */
public class Carro {
private Chasis chasis;
private Motor motor;
private Rueda tipoRuedas;
private Rueda[]ruedas;
private	String color;
private String tipoCarro;
private String placa;

public Carro(String color, String tipoCarro, String placa,Rueda[] ruedas,Motor motor) {
	
	this.color = color;
	this.tipoCarro = tipoCarro;
	this.placa = placa;
	this.ruedas=ruedas;
	//agregacion  en codigo no se nota mucho la diferencia con una relacion normal
	this.motor=motor;
	//composicion en el constructor se crea el objeto si esta clase se elimina ps el objeto tambn 
	this.chasis=new Chasis("aluminio","generico");
}

public Chasis getChasis() {
	return chasis;
}
public Rueda getTipoRuedas() {
	return tipoRuedas;
}

public void setTipoRuedas(Rueda tipoRuedas) {
	this.tipoRuedas = tipoRuedas;
}

public void setChasis(Chasis chasis) {
	this.chasis = chasis;
}
public Motor getMotor() {
	return motor;
}
public void setMotor(Motor motor) {
	this.motor = motor;
}
public Rueda[] getRuedas() {
	return ruedas;
}
public void setRuedas(Rueda[] ruedas) {
	this.ruedas = ruedas;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getTipoCarro() {
	return tipoCarro;
}
public void setTipoCarro(String tipoCarro) {
	this.tipoCarro = tipoCarro;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String datosCarro(){
	return "el color del carro es: "+getColor()+" tipo de carro: "+getTipoCarro()+ " placa: "+getPlaca()+ "\n tipo de ruedas "
			+" motor: "+getMotor().getCc()+" chasis: "+getChasis().getMaterial()+" "+datosllanta(); 
}
public String datosllanta(){
	for (Rueda rueda : ruedas) {
		System.out.println(rueda.getTipoRuedas());
	}
	return " ";
}

}


