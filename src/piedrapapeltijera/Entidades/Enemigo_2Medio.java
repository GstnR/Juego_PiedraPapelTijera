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
public final class Enemigo_2Medio extends Enemigo {

    public Enemigo_2Medio(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public int ataque() {
        Integer rand = (int) (Math.random() * 2);

        if (rand == 0) {
            Mano m = Mano.PIEDRA;
             this.mano = m;
            return m.getIndex();
        } else {
            Mano m= Mano.PAPEL;

            super.setMano(m);
            
            return m.getIndex();
        }

    }

}
