/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.Confusion;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Butterfree extends Pokemon {

    public enum Movimientos {
        CONFUSION,
        PLACAJE,

        //Otros movimientos...
    }

    public Butterfree() {
        this.tipo = "BICHO/VOLADOR";
        this.hp = 65;
        this.ataque = 45;
        this.defensa = 50;
        this.nivel = 10;
        this.precision = 3;
        //....
    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Butterfree.Movimientos movimientoAUtilizar = Butterfree.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case CONFUSION:
                instanciaMovimiento = new Confusion();
                break;
            case PLACAJE:
                instanciaMovimiento = new Placaje();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }
        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
