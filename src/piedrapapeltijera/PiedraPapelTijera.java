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

        juego.jugar();

    }
}
