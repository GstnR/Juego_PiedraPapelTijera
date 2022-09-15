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

    /*
 public int ganador(Mano j1, Mano j2){
        return this.tablero[j1.getIndex()][j2.getIndex()];
    }
     */
    public Jugador crearJugador() {
        System.out.println("Ingrese Su nombre");
        String nombre = leer.next();

        return new Jugador(nombre);
    }

    public ArrayList cargarEnemigos() {

        Enemigo e1 = new Enemigo_1Facil("facil", "que suerte!");
        Enemigo e2 = new Enemigo_2Medio("medio", "para la proxima");
        Enemigo e3 = new Enemigo_3Dificil("dificil", "Bueee...", "JAJAJAJJ NO SABES Jugar");
        Enemigo e4 = new Enemigo_3Dificil("Dificil Final", "BIEN!", "A LLORAR AL CAMPITO");
        Enemigo e5 = new Enemigo_3Dificil("Dificil Final", "BIEN!", "PU..!!!");

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
