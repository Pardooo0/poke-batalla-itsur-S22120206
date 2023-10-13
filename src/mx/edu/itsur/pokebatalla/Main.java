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
        System.out.println("PokeBatalla!");

        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander();
        Ivysaur ivysaurSalvaje = new Ivysaur();
        Wartortle wartortleSalvaje = new Wartortle();
        Charmeleon charmeleonSalvaje = new Charmeleon();
        Ivysaur ivysaurEntrenador = new Ivysaur();
        Wartortle wartortleEntrenador = new Wartortle();
        Charmeleon charmeleonEntrenador = new Charmeleon();

        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("pedro");
        Pikachu miPikachu = pikachuSalvaje;

        miPikachu.atacar(charmanderSalvaje);

        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");

        //pelea
        ivysaurEntrenador.setNombre("Ivysaur");
        ivysaurEntrenador.atacar(wartortleSalvaje);
        ivysaurEntrenador.atacar(wartortleSalvaje, "LÁTIGO CEPA");

        wartortleEntrenador.setNombre("Wartortle");
        wartortleEntrenador.atacar(charmeleonSalvaje);
        wartortleEntrenador.atacar(charmeleonSalvaje, "PISTOLA AGUA");

        charmeleonEntrenador.setNombre(" Charmeleon");
        charmeleonEntrenador.atacar(ivysaurSalvaje);
        charmeleonEntrenador.atacar(ivysaurSalvaje, "LANZA LLAMAS");

    }

}
