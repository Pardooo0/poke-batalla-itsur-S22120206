/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.Bombardeo;
import mx.edu.itsur.pokebatalla.model.moves.Confusion;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Placaje;
import mx.edu.itsur.pokebatalla.model.moves.RayoConfuso;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Exeggcute extends Pokemon {

    public enum Movimientos {
        CONFUSION,
        ATAQUE_RAPIDO,
        PLACAJE

        //Otros movimientos...
    }

    public Exeggcute() {
        this.tipo = "PLANTA/PSIQUICO";
        this.hp = 60;
        this.ataque = 40;
        this.defensa = 80;
        this.nivel = 1;
        this.precision = 3;
        this.xp = 98;

    }

    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("El Pokemon esta agotado y no puede realizar mas movimientos");
            return;
        }
        Exeggcute.Movimientos movimientoAUtilizar = Exeggcute.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;

        switch (movimientoAUtilizar) {
            case CONFUSION:
                instanciaMovimiento = new Confusion();
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
        return Exeggcute.Movimientos.values();
    }
}
