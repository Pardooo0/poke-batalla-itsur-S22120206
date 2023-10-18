/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Bombardeo;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Exeggcute extends Pokemon {
    public Exeggcute() {
        this.tipo = "PLANTA/PSIQUICO";
        this.hp = 60;
        this.ataque = 40;
        this.defensa = 80;
        this.nivel = 1;
        this.precision = 3;
        this.movimientos.add(new Bombardeo());
    }

    //Constructor alterno 1
    public Exeggcute(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("BOMBA GERMEN")) {
            System.out.println("Realizando BOMBA GERMEN");
            
        } else if (habilidad.equals("CONFUSIÓN")) { 
            System.out.println("Realizando CONFUSIÓN");
        }
        //TODO: otras habilidades...
    }
}
