/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Charmander extends Pokemon {

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        ATAQUE_RAPIDO,

        //Otros movimientos...
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
        
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }

        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {

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

    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }
}
