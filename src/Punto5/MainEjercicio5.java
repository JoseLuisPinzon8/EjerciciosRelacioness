/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author JoseLuis
 */
public class MainEjercicio5 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Articulo blood= new Articulo("1","Blood Born",100000);
Articulo uncharted= new Articulo("2","Uncharted",120000);
Articulo god= new Articulo("3","God of War",160000);
Articulo halo= new Articulo("1","Halo 5",100000);
Articulo forza= new Articulo("2", "Forza Horizon 3", 150000);
Articulo gears = new Articulo("3","Gears of Wars",140000);
Articulo zelda= new Articulo("1", "Zelda BOTW", 160000);
Articulo mario= new Articulo("2", "Mario Odissey", 180000);
Articulo bayonetta= new Articulo("3", "bayonetta", 100000);

Producto juegos= new Producto("1","juegos de ps4","juegos exclusivos de ps4");
Producto juegosXbox =new Producto("2", "juegos de xbox one", "juegos exclusivos de xbox one");
Producto nintiendo= new Producto("3", "juegos de nintiendo", "juegos exclusivos de nintiendo");


juegos.crearArticulos();
juegos.almacenarArticulos(blood);
juegos.almacenarArticulos(uncharted);
juegos.almacenarArticulos(god);

juegosXbox.crearArticulos();
juegosXbox.almacenarArticulos(halo);
juegosXbox.almacenarArticulos(forza);
juegosXbox.almacenarArticulos(gears);

nintiendo.crearArticulos();
nintiendo.almacenarArticulos(zelda);
nintiendo.almacenarArticulos(mario);
nintiendo.almacenarArticulos(bayonetta);


Categoria games= new Categoria("1", "Video Games", "juegos de consolas");
games.crearProductos();
games.añadirProductos(juegos);
games.añadirProductos(juegosXbox);
games.añadirProductos(nintiendo);

games.informacion();

Cliente cliente = new Cliente("1","Pepito","Pipo","1234567","siempre viva","123","Bogota","Chibchombia","nose");
}      
}
