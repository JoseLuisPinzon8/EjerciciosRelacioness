/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6B;

/**
 *
 * @author JoseLuis
 */
public class ABCDmain {
    public static void main(String[] args) {
        G[]elements	= {new G(), new F(), new H(), new E()};

    for (int i = 0; i < elements.length; i++) {
	System.out.println(elements[i]);
	elements[i].method1();
	elements[i].method2();
	System.out.println(	);
        }
    }
}

/*

Obviamente es muy sencillo hacerlo, es copiar el codigo y se obtiene la respuesta.
El analisis real esta en explicar por que.

La primera G parte (TRES PRIMERAS LINEAS) sale porque se instancia la clase G
en ella se aplican los metodos toString que retorna una G, y al elemento sub 0 
, es decir a G, se le aplica el method1 que retorna G 1 y el method2 que retorna G 2.
Seguido de un salto de linea

Para la segunda parte se instancia F. Como F hereda de G, hereda sus metodos.
Pero en ejecucion entonces primero aplica la funcion toString que rotorna "F"
Despues ejecuta el method1 sin redefinirlo, es decir, tal cual esta en G, por eso sale G1
Pero de manera contraria, si re define el method2 por lo que ahora sale F 2, y el super
invoca el constaructor del papa de method2, por lo cual se devuelve a la clase G y ejecuta
el metodo G, por eso el G2

Para la tercera parte se instancia H, pero H hereda de E, pero E hereda de F y F hereda  de G
Entonces busca imprimir el primer toString que encuentre, no esta en H, no esta en E,
esta en F, lo imprime. Luego el metodo1, empieza a mirar a ver si esta en H, esta, lo imprime.
Para el metodo2 mira si esta en H, no esta, mira si esta en E, esta, lo ejecuta. Este
imprime E 2 y luego ejecuta el metodo 1. El progrma mira a ver si hay redefinicion del
metodo en H, hay, entonces la ejecuta.


Para la cuarta parte se instancia E, pero E hereda de F y F hereda de G, y como
F tiene el primer codigo que rotorna un toString entonces por eso sale F. Luego,
se devuelve hasta E y verifica si hay method1, no hay, verifica si hay en F, no hay,
por eso se va hasta G, se da cuenta que si hay y ejecuta la version de G. Para el method2
el mira si en E esta redefinido, si esta, ejecuta esa version, luego de imprimir E 2 
ejecuta el method1 otra vez, por eso sale otra vez G1. Salto de linea como a lfinal de cada parte
y ejecucion terminada.

*/