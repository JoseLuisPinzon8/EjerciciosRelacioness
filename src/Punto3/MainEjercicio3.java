/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author JoseLuis
 */
public class MainEjercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Segmento segmentoSem1Sala1 = new Segmento("2:00 PM","4:00 PM");
		Segmento segmentoSem2Sala1 = new Segmento("4:00 PM","6:00 PM");
		Segmento segmentoSem1Sala2= new Segmento("7:00 PM", "9:00 PM");
		Segmento segmentosem2Sala2 = new Segmento("8:00 PM" , "10:00 PM");
		
		ArrayList<Segmento>segmentos = new ArrayList<Segmento>();
		
		segmentos.add(segmentoSem1Sala1);
		segmentos.add(segmentoSem2Sala1);
		segmentos.add(segmentoSem1Sala2);
		segmentos.add(segmentosem2Sala2);
		
		GregorianCalendar diaSem0Sala0= new GregorianCalendar(2017,3,17);
		GregorianCalendar diaSem1Sala1= new GregorianCalendar(2017,3,18);
		GregorianCalendar diaSem1Sala2= new GregorianCalendar(2017,3,20);
		GregorianCalendar diaSem2Sala1= new GregorianCalendar(2017,3,26);
		GregorianCalendar diaSem2Sala2= new GregorianCalendar(2017,3,28);
		
		Dia[] dias_habiles = new Dia[5];
		dias_habiles[4]= new Dia(diaSem0Sala0,"lunes",segmentos);
		dias_habiles[0]= new Dia(diaSem1Sala1, "Martes", segmentos);
		dias_habiles[1]= new Dia(diaSem1Sala2,"Jueves",segmentos);
		dias_habiles[2]= new Dia(diaSem2Sala1,"Miercoles",segmentos);
		dias_habiles[3]= new Dia(diaSem2Sala2,"Viernes",segmentos);
		
		ArrayList<Semana>semanaS= new ArrayList<Semana>();
		
		ArrayList<Sala>salaS= new ArrayList<Sala>();
		
		Sala sala1 = new Sala("Sala1",semanaS);
		Sala sala2 = new Sala("Sala2",semanaS);
		salaS.add(sala1);
		salaS.add(sala2);
		
		Semana semana1= new Semana(1,salaS,dias_habiles);
		Semana semana2= new Semana(2,salaS,dias_habiles);
		semanaS.add(semana1);
		semanaS.add(semana2);
		
		Programacion programacion = new Programacion(salaS);
		
		programacion.informacion();
		//falta hacer la impresion 
		
		
		

		
	}
    
}
