/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.pokemons;



/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Ivysaur extends Pokemon {

    public Ivysaur() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 60;
        this.ataque = 62;
        this.defensa = 63;
        this.nivel = 16;
        this.precision = 5;
       
    }

    //Constructor alterno 1
    public Ivysaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    public void atacar(Pokemon oponente, String habilidad) {
        if (habilidad.equals("LÁTIGO CEPA")) {

            System.out.println("Realizando LÁTIGO CEPA");
        } else if (habilidad.equals("POLVO VENENO")) {

            System.out.println("Realizando POLVO VENENO");
        }
        //TODO: otras habilidades...
    }
}
