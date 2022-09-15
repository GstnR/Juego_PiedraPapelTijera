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

        Tablero ta = juego.crearTablero();
        Jugador yo = juego.crearJugador();
        ArrayList<Enemigo> en = juego.cargarEnemigos();

        for (Enemigo enemigo : en) {
            yo.setMano(juego.elegirMano());
            int resultado = ta.getTablero(yo.getMano().getIndex(), enemigo.ataque());
            switch (resultado) {
                case -1:
                    System.out.println("Perdiste");
                    System.out.println("Mensaje Enemigo: "+enemigo.getMensaje());
                    if (enemigo instanceof Enemigo_3Dificil) {
                        System.out.println("Insulto:" + ((Enemigo_3Dificil) enemigo).getInsulto());
                    }
                    break;
                case 0:
                    System.out.println("empate");
                    System.out.println("Mensaje Enemigo: " + enemigo.getMensaje());
                    break;
                case 1:
                    System.out.println("ganaste");
                    System.out.println("Mensaje Enemigo: " + enemigo.getMensaje());
                    break;

            }
        }

    }
}
