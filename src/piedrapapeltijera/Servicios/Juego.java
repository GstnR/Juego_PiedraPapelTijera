/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piedrapapeltijera.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import piedrapapeltijera.Entidades.Enemigo;
import piedrapapeltijera.Entidades.Enemigo_1Facil;
import piedrapapeltijera.Entidades.Enemigo_2Medio;
import piedrapapeltijera.Entidades.Enemigo_3Dificil;
import piedrapapeltijera.Entidades.Jugador;
import piedrapapeltijera.Entidades.Tablero;
import piedrapapeltijera.Enums.Mano;

/**
 *
 * @author Gaston Rojas
 */
public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Enemigo> Enemigos = new ArrayList();

    public Tablero crearTablero() {

        return new Tablero();

    }


    public Jugador crearJugador() {
        System.out.println("Ingrese Su nombre");
        String nombre = leer.next();

        return new Jugador(nombre);
    }

    public ArrayList cargarEnemigos() {

        Enemigo e1 = new Enemigo_1Facil("facil", "Que suerte!!!!");
        Enemigo e2 = new Enemigo_2Medio("medio", "Para la proxima vez sera...");
        Enemigo e3 = new Enemigo_3Dificil("dificil", " ... ", "No seas mal perdedor");
        Enemigo e4 = new Enemigo_3Dificil("Dificil Final", "La suerte hablo!", " deja de jugar y estudia programacion ...");
        Enemigo e5 = new Enemigo_3Dificil("Dificil Final", "que Suerte!", "Volve a ver los videos de Herencia, please!!!");

        Enemigos.add(e1);
        Enemigos.add(e2);
        Enemigos.add(e3);
        Enemigos.add(e4);
        Enemigos.add(e5);

        return Enemigos;
    }

    public Mano elegirMano() {
        System.out.println("\n-----------------");
        System.out.println("Cual elijes?");
        System.out.println("1 - Piedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tijera\n");

        Mano m = null;

        switch (leer.nextInt()) {
            case 1:
                m = Mano.PIEDRA;
                break;

            case 2:
                m = Mano.PAPEL;
                break;

            case 3:
                m = Mano.TIJERA;
                break;

        }

        return m;

    }
    
    public void mensaje(){
        System.out.println("Bienvenido\nJueguemos Piedra Papel y Tijera");
    }
    
    public void mensajeFinal(Jugador j){
        System.out.println("--------------\n--------------\n--------------");
        System.out.println("hola "+ j.getNombre() +"\ntu puntaje es: " + j.getPuntaje());
    }

}
