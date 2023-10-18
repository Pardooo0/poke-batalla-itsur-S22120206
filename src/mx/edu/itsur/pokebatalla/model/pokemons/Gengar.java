/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.BolaSombra;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;

/**
 *
 * @author DIEGO JAVIER OROZCO AGUIRRE
 */
public class Gengar extends Pokemon {

    public Gengar() {
        this.tipo = "FANTASMA/VENENO";
        this.hp = 60;
        this.ataque = 65;
        this.defensa = 60;
        this.nivel = 1;
        this.precision = 5;
        this.movimientos.add(new BolaSombra());
        this.movimientos.add(new AtaqueRapido());
    }

    //Constructor alterno 1
    public Gengar(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("PUÑO SOMBRA")) {
            System.out.println("Realizando PUÑO SOMBRA");
        } else if (habilidad.equals("BOMBA ACIDA")) {
            System.out.println("Realizando BOMBA ACIDA");
        }
        //TODO: otras habilidades...
    }
}
