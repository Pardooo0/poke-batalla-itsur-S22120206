/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;



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

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("GOLPE ROCA")) {
            System.out.println("Realizando GOLPE ROCA");
        } else if (habilidad.equals("ULTRAPUÑO")) {
            System.out.println("Realizando ULTRAPUÑO");
        }
        //TODO: otras habilidades...
    }
}
