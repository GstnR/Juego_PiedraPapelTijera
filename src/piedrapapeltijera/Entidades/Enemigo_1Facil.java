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
public final class Enemigo_1Facil extends Enemigo {

    public Enemigo_1Facil(String nombre, String descripcion) {
        super(descripcion);
    }

    @Override
    public int ataque() {

        Mano m = Mano.PIEDRA;
        
        super.setMano(m);

        return m.getIndex();
    }


    

}
