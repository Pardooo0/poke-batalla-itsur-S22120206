/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Confusion;

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

    //Constructor alterno 1
    public Butterfree(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }



}
