/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Confusion;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;


/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Jigglypuff extends Pokemon {

    public enum Movimientos {
        CONFUSION,
        PLACAJE

        //Otros movimientos...
    }

    public Jigglypuff() {
        this.tipo = "NORMAL/HADA";
        this.hp = 115;
        this.ataque = 45;
        this.defensa = 20;
        this.nivel = 1;
        this.precision = 4;

        //....
    }

    //Constructor alterno 1
    public Jigglypuff(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Jigglypuff.Movimientos movimientoAUtilizar = Jigglypuff.Movimientos.values()[ordinalMovimiento];
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
