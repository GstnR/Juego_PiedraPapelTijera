/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.ArrayList;
import piedrapapeltijera.Entidades.Enemigo;
import piedrapapeltijera.Entidades.Enemigo_3Dificil;
import piedrapapeltijera.Entidades.Jugador;
import piedrapapeltijera.Entidades.Tablero;
import piedrapapeltijera.Servicios.Juego;

/**
 *
 * @author Gaston Rojas
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Juego juego = new Juego();

        Tablero tablero = juego.crearTablero();
        Jugador jugador = juego.crearJugador();
        ArrayList<Enemigo> enemigos = juego.cargarEnemigos();

        for (Enemigo enemigo : enemigos) {
            jugador.setMano(juego.elegirMano());
            int resultado = tablero.getTablero(jugador.getMano().getIndex(), enemigo.ataque());
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

        juego.mensajeFinal(jugador);

    }
}
