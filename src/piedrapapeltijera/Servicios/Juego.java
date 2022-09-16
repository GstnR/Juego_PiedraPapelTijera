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
        String eleccion = null;
        do {

            eleccion = leer.next();
            eleccion = eleccion.toLowerCase();

            switch (eleccion) {
                case "1":
                case "piedra":

                    m = Mano.PIEDRA;
                    break;

                case "2":

                case "papel":
                    m = Mano.PAPEL;
                    break;

                case "3":

                case "tijera":
                    m = Mano.TIJERA;
                    break;

                default:
                    System.out.println("ingresaste un valor no valid\npor favor ingrese un valor correcto");
                    eleccion = "0";

            }
        } while (eleccion.equals("0"));

        return m;

    }

    public void mensaje() {
        System.out.println("Bienvenido\nJueguemos Piedra Papel y Tijera\n\nveamos que tan bueno eres...\n");
    }

    public void mensajeFinal(Jugador j) {
        System.out.println("--------------\n--------------\n--------------");
        System.out.println("hola " + j.getNombre() + "\ntu puntaje es: " + j.getPuntaje());
    }

    
    public void jugar(){
    
         this.mensaje();
        
       Tablero tablero = this.crearTablero();
        Jugador jugador = this.crearJugador();
        
        ArrayList<Enemigo> enemigos = this.cargarEnemigos();
    
        for (Enemigo enemigo : enemigos) {
            jugador.setMano(this.elegirMano());
            int resultado = tablero.getTablero(jugador.getMano().getIndex(), enemigo.ataque());
            
            System.out.println("\nTu: "+jugador.getMano()+"  Vs  " + enemigo.getMano());
            
            
                   
            switch (resultado) {
                case -1:
                    System.out.println("Resultado: -> Perdiste");
                    System.out.println("Mensaje Enemigo: " + enemigo.getMensaje());
                    if (enemigo instanceof Enemigo_3Dificil) {
                        System.out.println("Insulto:" + ((Enemigo_3Dificil) enemigo).getInsulto());
                    }
                    jugador.setPuntaje(jugador.getPuntaje() - 1);
                    break;
                case 0:
                    System.out.println("Resultado: -> Empate");
                    System.out.println("Mensaje Enemigo: " + enemigo.getMensaje());
                    break;
                case 1:
                    System.out.println("Resultado: -> Ganaste");
                    System.out.println("Mensaje Enemigo: " + enemigo.getMensaje());
                    jugador.setPuntaje(jugador.getPuntaje() + 1);
                    break;
            }
        }
        
        this.mensajeFinal(jugador);
        
    }
    
    
}
