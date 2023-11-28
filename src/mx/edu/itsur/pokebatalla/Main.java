/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmeleon;
import mx.edu.itsur.pokebatalla.model.pokemons.Ivysaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Wartortle;


/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello PokeBatalla!");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        
        //Instanciar pokemons
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        //////////////////////////////////////////////////
        Wartortle wart = new Wartortle();
        Ivysaur ivy = new Ivysaur();
        Charmeleon Charmi = new Charmeleon();
        //////////////////////////////////////////////////
        //Instanciar entrenadores y que capturen pokemons

        //Instanciar batalla e iniciarla.
        
        
        ///////////////////////////////////////////////////
        //Instanciar entrenadores y que capturen pokemons
        Entrenador ent1 = new Entrenador("Arnold");
        ent1.capturarPokemon(pika);
        ent1.capturarPokemon(ivy);

        Entrenador ent2 = new Entrenador("El del bigotito");
        ent2.capturarPokemon(Charmi);
        ent2.capturarPokemon(wart);
        
        //Instanciar batalla e iniciarla.
        Batalla Examen = new Batalla(ent1, ent2);
        Examen.desarrollarBatalla();
        
    }

}
