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
public class Wartortle extends Pokemon {

    public Wartortle() {
        this.tipo = "AGUA";
        this.hp = 59;
        this.ataque = 63;
        this.defensa = 80;
        this.nivel = 16;
        this.precision = 5;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("PISTOLA AGUA");
        this.habilidades.add("HIDROBOMBA");
    }

    //Constructor alterno 1
    public Wartortle(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("PISTOLA AGUA")) {
            //Logica del daño por atacktrueno
            System.out.println("Realizando PISTOLA AGUA");
        } else if (habilidad.equals("HIDROBOMBA")) {
            //Logica del daño por BOLAVOLTIO
            System.out.println("Realizando HIDROBOMBA");
        }
        //TODO: otras habilidades...
    }
}
