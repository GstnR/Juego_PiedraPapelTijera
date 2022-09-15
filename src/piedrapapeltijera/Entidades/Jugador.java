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
public class Jugador {

    String nombre;
    Mano mano;
    int puntaje = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public Mano getMano() {
        return mano;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
