/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piedrapapeltijera.Entidades;

import piedrapapeltijera.Enums.Mano;

/**
 *
 * @author Gaston Rojas
 */
public class Tablero {
    
    private int[][] tablero;


    public Tablero() {
        this.inicializarTablero();
    }

    private int[][] inicializarTablero() {

        /*
                                 jugador 2
                         piedra(0)   papel(1)   Tijera(2)
                Piedra(0)     0       -1           1
    jugador 1   Papel (1)     1        0          -1
               Tijera (2)    -1        1           0  
    
         */
        int[][] t = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
        };

        return this.tablero = t;
    }

    public Integer getTablero(int a, int b) {
        Integer valor = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((a==i)&&(b==j)) {
                    valor = this.tablero[i][j];
                }
            }
        }
        
        return valor;
        
    }
    
    
    
}
