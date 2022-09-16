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
        super(nombre, descripcion);
    }

    @Override
    public int ataque() {

        Mano m = Mano.PIEDRA;
        
        this.mano = m;

        return m.getIndex();
    }
   

}
