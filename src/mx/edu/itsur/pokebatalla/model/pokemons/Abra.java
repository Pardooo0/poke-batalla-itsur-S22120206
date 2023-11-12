/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;
import mx.edu.itsur.pokebatalla.model.moves.Teletransporte;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Abra extends Pokemon {

    public enum Movimientos {
        TELETRANSPORTE,

        //Otros movimientos...
    }

    public Abra() {
        this.tipo = "PSIQUICO";
        this.hp = 25;
        this.ataque = 20;
        this.defensa = 15;
        this.nivel = 1;
        this.precision = 5;
        this.xp = 73;
    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }

        Abra.Movimientos movimientoAUtilizar = Abra.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        
        switch (movimientoAUtilizar) {
            case TELETRANSPORTE:
                instanciaMovimiento = new Teletransporte();
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
        return Abra.Movimientos.values();
    }
}
