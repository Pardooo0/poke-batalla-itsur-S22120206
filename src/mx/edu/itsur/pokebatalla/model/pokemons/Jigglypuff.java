/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;


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

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("DESTRUCTOR")) {
            System.out.println("Realizando DESTRUCTOR");

        } else if (habilidad.equals("BRILLO MÁGICO")) {
            System.out.println("Realizando BRILLO MÁGICO");
        }
        //TODO: otras habilidades...
    }
}
