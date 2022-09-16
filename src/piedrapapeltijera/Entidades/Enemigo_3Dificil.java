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
public final class Enemigo_3Dificil extends Enemigo {

    String insulto;

    public Enemigo_3Dificil(String nombre, String descripcion, String insulto) {
        super(nombre, descripcion);
        this.insulto = insulto;
    }

    @Override
    public int ataque() {
        Integer rand = (int) (Math.random() * 2);

        Mano mano = null;

        switch (rand) {
            case 0:
                mano = Mano.PIEDRA;
                break;
            case 1:
                mano = Mano.PAPEL;
                break;
            case 2:
                mano = Mano.TIJERA;
                break;

        }
        
        super.setMano(mano);
        
        return mano.getIndex();

    }

    public String getInsulto() {
        return insulto;
    }

}
