/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import mx.edu.itsur.pokebatalla.model.ControlArchivos.FileManager;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Batalla implements Serializable {

    // Atributos
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    // Constructor
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    // Métodos
    public void salvarProgreso() {
        FileManager.guardarPartida(this);
    }

    public void desarrollarBatalla() {
        // Variables que se utilizarán
        Entrenador entrenadorEnTurno = null;
        Entrenador entrenadorOponente = null;

        System.out.println("\u001B[34mCOMIENZA LA BATALLA!!! \u001B[30m");
        System.out.println(entrenador1.nombre + "\u001B[31m V.S. \u001B[30m" + entrenador2.nombre);
        System.out.println("-----------------------------------------");

        // La primera vez ambos entrenadores se elegirán Pokémon
        // 1. El primer entrenador selecciona su pokemon.
        do {
 
            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\u001B[31mSolamente cuentas con "
                        + entrenador1.getPokemonsCapturados().size()
                        + " Elige alguno de ellos!!! ");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        // 2. El segundo entrenador selecciona su pokemon.
        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\u001B[31mSolamente cuentas con "
                        + entrenador2.getPokemonsCapturados().size()
                        + " Elige alguno de ellos!!! ");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {

            // 1. Asignar variables de entrenador acorde al turno.
            if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
            } else {
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
            }
            System.out.println("Es el turno de: " + entrenadorEnTurno.nombre);

            // 2. Se da opción al entrenador en turno de que cambie de Pokemon antes de escoger movimiento.
            if (entrenadorEnTurno.getPokemonActual().getHP() > 0 && entrenadorOponente.getPokemonActual().getHP() > 0) {
                System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
                System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
                System.out.println("\u001B[31mDeseas cambiar de Pokemon?");
                System.out.println("1 -> NO");
                System.out.println("2 -> SI");
                System.out.println("\u001B[31mDeseas guardar la partida?");
                System.out.println("Y -> SI");
                System.out.println("N -> NO");
                try {
                    char auxLectura = (char) System.in.read(); // Leer opción seleccionada
                    System.in.read(new byte[System.in.available()]); // Limpiar buffer

                    if (auxLectura == '2') {
                        seleccionarPokemon(entrenadorEnTurno);
                    }
                    else if(auxLectura=='Y'){
                        salvarProgreso();
                        return;
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("\u001B[31mCual de los siguientes movimientos desea utilizar?");
                for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimientos()) {
                    System.out.println(movimiento.ordinal() + 1 + " -> "
                            + movimiento.name());
                }

                try {
                    char auxLectura = (char) System.in.read(); // Leer opción seleccionada
                    System.in.read(new byte[System.in.available()]); // Limpiar buffer

                    // 3. El pokemon realiza el ataque.
                    entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.getPokemonActual(), Character.getNumericValue(auxLectura) - 1);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // 4. Revisar si ya terminó la batalla 
                // (Todos los pokemons del oponente quedan inhabilitados) 
                if (entrenadorOponente.estaDerrotado()) {
                    // Si terminó, se ha terminado la batalla.
                    System.out.println(entrenadorOponente.getNombre() + " esta derrotado!!!");
                    System.out.println("\u001B[31mFelicidades " + entrenadorEnTurno.getNombre() + "!! HAS GANADO LA BATALLA!!!");
                    batallaFinalizada = true;
                
                } else {
                    // 5. Si nadie ha ganado aún, se cambia el turno y repite.
                    salvarProgreso();
                    if (turno == 1) {
                        turno = 2;
                    } else {
                        turno = 1;
                    }
                }
                System.out.println("-----------------------------------------");

            } else if (entrenadorEnTurno.getPokemonActual().getHP() > 0 && entrenadorOponente.getPokemonActual().getHP() <= 0) {
                System.out.println(entrenadorEnTurno.getNombre() + " tu Pokemon actual es: " + entrenadorEnTurno.getPokemonActual());
                System.out.println("\u001B[31mEl Pokemon de tu oponente esta debilitado");
                if (entrenadorOponente.estaDerrotado()) {
                    // Si terminó, se ha terminado la batalla.
                    System.out.println(entrenadorOponente.getNombre() + " esta derrotado!!!");
                    System.out.println("\u001B[31mFelicidades " + entrenadorEnTurno.getNombre() + "!! HAS GANADO LA BATALLA!!!");
                    batallaFinalizada = true;
                } else {
                    System.out.println("\u001B[31mSu pokemon esta debilidato tu oponente debe cambiarlo");
                    seleccionarPokemon(entrenadorOponente);
                }
                System.out.println("-----------------------------------------");

            } else if (entrenadorEnTurno.getPokemonActual().getHP() <= 0 && entrenadorOponente.getPokemonActual().getHP() > 0) {
                System.out.println("\u001B[31mtu pokemon se debilito cambialo");
                System.out.println("El Pokemon de tu oponente " + entrenadorOponente.getNombre() + " es: " + entrenadorOponente.getPokemonActual());
                System.out.println("\u001B[31mDeseas cambiar de Pokemon?");
                seleccionarPokemon(entrenadorEnTurno);
            }
        }
    }

    private void seleccionarPokemon(Entrenador ent) {
        // El entrenador selecciona el Pokémon a utilizar.
        boolean kk = false;
        while (!kk) {
            System.out.println("\u001B[31mCual de los siguientes Pokemon desea utilizar " + ent.nombre + "?");
            int auxCount = 1;

            for (Pokemon p : ent.getPokemonsCapturados()) {
                System.out.println(auxCount + " -> " + p);
                auxCount++;
            }

            try {
                int opcionSeleccionada = new Scanner(System.in).nextInt(); // Leer opción seleccionada

                // Validar si el número está dentro del rango válido
                if (opcionSeleccionada >= 1 && opcionSeleccionada <= ent.getPokemonsCapturados().size()) {
                    // Obtener el Pokémon seleccionado de la lista.
                    Pokemon pokemonSeleccionado = ent.getPokemonsCapturados().get(opcionSeleccionada - 1);
                    if (pokemonSeleccionado.getHp() > 0) {
                        ent.setPokemonActual(pokemonSeleccionado);
                        System.out.println(ent.nombre + " ha seleccionado a: " + ent.getPokemonActual());
                        System.out.println("-----------------------------------------");
                        kk=true;
                    } else {
                        if(ent.getPokemonsCapturados().get(0).getHP()==0 && ent.getPokemonsCapturados().get(1).getHP()==0){
                            System.out.println("ya perdiste tilin");
                            
                            return;
                        }
                        System.out.println("");
                        System.out.println("\u001B[31mTu pokemon se debilito cambialo");
                    }

                } else {
                    System.out.println("Por favor, introduce un número válido.");
                }

            } catch (Exception ex) {
                System.out.println("Error: Introduce un número válido.");
            }
        }
    }

}
