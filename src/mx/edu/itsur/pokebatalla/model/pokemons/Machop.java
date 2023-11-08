/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.GolpeKarate;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;



/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Machop extends Pokemon {
    public enum Movimientos {
        PLACAJE,
        GOLPE_KARATE,
        ATAQUE_RAPIDO

        //Otros movimientos...
    }

    public Machop() {
        this.tipo = "LUCHA";
        this.hp = 70;
        this.ataque = 80;
        this.defensa = 50;
        this.nivel = 1;
        this.precision = 3;
 
    }

    //Constructor alterno 1
    public Machop(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

   public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Machop.Movimientos movimientoAUtilizar = Machop.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case GOLPE_KARATE:
                instanciaMovimiento = new GolpeKarate();
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
