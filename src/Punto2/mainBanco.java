/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class mainBanco {
    
	public static void main(String[] args) {
		//creando los dos tipos de cuenta
		Tipo tipo1= new Tipo("Retirar_dinero");
		Tipo tipo2= new Tipo("Ver_saldo");
		
		//creando las fechas
		GregorianCalendar calendario= new GregorianCalendar(2017, 0,30 );
		GregorianCalendar calendario2= new GregorianCalendar(2016, 10,19 );
		GregorianCalendar cuenta1mov1= new GregorianCalendar(2017,2,20);
		GregorianCalendar cuenta1omov2= new GregorianCalendar(2017,3,20);
		GregorianCalendar cuenta2mov1= new GregorianCalendar(2016,13,9);
		GregorianCalendar cuenta2mov2= new GregorianCalendar(2017,0,12);
		//creando movimientos de cuenta
		Movimiento cta1movimiento1= new Movimiento(cuenta1mov1, 0, 100000, tipo1);
		Movimiento cta1movimiento2= new Movimiento(cuenta1omov2, 0, 0, tipo2);
		Movimiento cta2movimiento1= new Movimiento(cuenta2mov1, 100000, 20000, tipo1);
		Movimiento cta2movimiento2= new Movimiento(cuenta2mov2, 100000, 0, tipo2);
		//creando las cuentas y los movimientos
		Cuenta cuenta1= new Cuenta(123,0,calendario,"Andres");
		cuenta1.adicionarMovimientos();
		Cuenta cuenta2= new Cuenta(456,100000,calendario2,"pepito");
		cuenta2.adicionarMovimientos();
		cuenta1.añadirObjeto(cta1movimiento1);
		cuenta1.añadirObjeto(cta1movimiento2);
		cuenta2.añadirObjeto(cta2movimiento1);
		cuenta2.añadirObjeto(cta2movimiento2);
		//creando la lista de tipos de cuenta y añadiendole los tipos
		ArrayList<Tipo>tiposDeCuenta= new ArrayList<Tipo>();
		tiposDeCuenta.add(tipo1);
		tiposDeCuenta.add(tipo2);
		//creando una lista de cuentas y sus numeros de cuenta
		ArrayList<Cuenta>numDeCuentas= new ArrayList<Cuenta>();
		numDeCuentas.add(cuenta1);
		numDeCuentas.add(cuenta2);
		//instanciando un objeto de tipo banco 
		Banco banco1= new Banco("davivienda",tiposDeCuenta,numDeCuentas);
		//cuenta1.fechas();
			banco1.informacion();	
		
		//System.out.println(calendario2.getTime());
			
	}
    
}
