/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piedrapapeltijera.Entidades;

import piedrapapeltijera.Enums.Mano;

/**
 *
 * @author Gaston Rojas
 * 
 * Clase abstacta del caul es la base de las otras 3 clases
 */
public abstract class Enemigo {

    String mensaje;
    Mano mano;

    public Enemigo(String mensaje) {
        this.mensaje = mensaje;
    }

//    private String getNombre() {
//        return nombre;
//    }

    public String getMensaje() {
        return mensaje;
    }

//    private void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

//    private void setMensaje(String mensaje) {
//        this.mensaje = mensaje;
//    }

    public abstract int ataque();

    public Mano getMano() {
        return mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }
    
    
    

}
