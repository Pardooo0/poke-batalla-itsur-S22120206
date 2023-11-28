/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PistolaAgua;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Ivysaur extends Pokemon implements Serializable{

    public enum Movimientos {
        PLACAJE,
        ATAQUE_RAPIDO,
        LATIGO

        //Otros movimientos...
    }

    public Ivysaur() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 60;
        this.ataque = 62;
        this.defensa = 63;
        this.nivel = 16;
        this.precision = 5;
        this.xp = 141;

    }

    //Constructor alterno 1
    public Ivysaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }

        Ivysaur.Movimientos movimientoAUtilizar = Ivysaur.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;
            case PLACAJE:
                instanciaMovimiento = new Placaje();
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

    @Override
    public Enum[] getMovimientos() {
        return Ivysaur.Movimientos.values();
    }
}
