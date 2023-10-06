/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Charmeleon;
import mx.edu.itsur.pokebatalla.model.Wartortle;
import mx.edu.itsur.pokebatalla.model.Ivysaur;
import mx.edu.itsur.pokebatalla.model.Pokemon;

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
