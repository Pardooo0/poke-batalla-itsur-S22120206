/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.pokemons;


import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;
import mx.edu.itsur.pokebatalla.model.moves.Proteccion;


/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Wartortle extends Pokemon {

    public enum Movimientos {
        PLACAJE,
        PISTOLA_AGUA,
        PROTECCION
       

        //Otros movimientos...
    }

    public Wartortle() {
        this.tipo = "AGUA";
        this.hp = 59;
        this.ataque = 63;
        this.defensa = 80;
        this.nivel = 16;
        this.precision = 5;

    }

    //Constructor alterno 1
    public Wartortle(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, Wartortle.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case PLACAJE:
                instanciaMovimiento = new Placaje();
                break;
            case PROTECCION:
                instanciaMovimiento = new Proteccion();
                break;
            case PISTOLA_AGUA:
                instanciaMovimiento = new PistolaAgua();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
