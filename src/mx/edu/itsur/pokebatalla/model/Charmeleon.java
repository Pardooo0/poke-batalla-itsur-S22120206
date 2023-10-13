/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Charmeleon extends Pokemon {

    public Charmeleon() {
        this.tipo = "FUEGO";
        this.hp = 68;
        this.ataque = 64;
        this.defensa = 58;
        this.nivel = 16;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("LANZA LLAMAS");
        this.habilidades.add("COLMILLO ÍGNEO");
    }

    //Constructor alterno 1
    public Charmeleon(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("LANZA LLAMAS")) {
            System.out.println("Realizando LANZA LLAMAS");
        } else if (habilidad.equals("COLMILLO ÍGNEO")) {
            System.out.println("Realizando COLMILLO ÍGNEO");
        }
        //TODO: otras habilidades...
    }
}
