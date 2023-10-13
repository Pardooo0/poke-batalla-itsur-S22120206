/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.util.ArrayList;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon {

    public Charmander() {
        this.tipo = "FUEGO";
        this.hp = 39;
        this.ataque = 52;
        this.defensa = 43;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ASCUAS");
        this.habilidades.add("COLMILLO ÍGNEO");
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("ASCUAS")) {
            System.out.println("Realizando ASCUAS");
        } else if (habilidad.equals("COLMILLO ÍGNEO")) {
            System.out.println("Realizando COLMILLO ÍGNEO");
        }
        //TODO: otras habilidades...
    }
}
