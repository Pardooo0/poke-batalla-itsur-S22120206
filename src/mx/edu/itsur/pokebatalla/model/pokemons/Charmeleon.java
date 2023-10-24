/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Ascuas;
import mx.edu.itsur.pokebatalla.model.moves.Malicioso;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Charmeleon extends Pokemon {

    public enum Movimientos {
        ASCUAS,
        ATAQUE_RAPIDO,
        MALICIOSO
        

        //Otros movimientos...
    }

    public Charmeleon() {
        this.tipo = "FUEGO";
        this.hp = 68;
        this.ataque = 64;
        this.defensa = 58;
        this.nivel = 16;
        this.precision = 4;

    }

    //Constructor alterno 1
    public Charmeleon(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

     public void atacar(Pokemon oponente, Charmeleon.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case MALICIOSO:
                instanciaMovimiento = new Malicioso();
                break;
            case ASCUAS:
                instanciaMovimiento = new Ascuas();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
