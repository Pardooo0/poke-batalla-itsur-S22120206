/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmeleon;
import mx.edu.itsur.pokebatalla.model.pokemons.Wartortle;
import mx.edu.itsur.pokebatalla.model.pokemons.Ivysaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Abra;
import mx.edu.itsur.pokebatalla.model.pokemons.Machop;
import mx.edu.itsur.pokebatalla.model.pokemons.Gengar;
import mx.edu.itsur.pokebatalla.model.pokemons.Exeggcute;
import mx.edu.itsur.pokebatalla.model.pokemons.Butterfree;
import mx.edu.itsur.pokebatalla.model.pokemons.Jigglypuff;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");

        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();

        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO);

        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO);

        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO);

        /////////////////////////////////////////////////////////////////////////////////////
        Wartortle wart = new Wartortle();
        Charmeleon charmi = new Charmeleon();
        Gengar Geng = new Gengar();

        System.out.println("->Charmeleon se encuentra con un Wartortle y ataca");
        charmi.atacar(wart, Charmeleon.Movimientos.ASCUAS);

        System.out.println("->Wartortle se molesta y responde ");
        wart.atacar(charmi, Wartortle.Movimientos.PISTOLA_AGUA);

        System.out.println("->Gengar se enoja porque atacaron a su amigo Charmeleon y...");
        Geng.atacar(wart, Gengar.Movimientos.BOLA_SOMBRA);

    }

}
