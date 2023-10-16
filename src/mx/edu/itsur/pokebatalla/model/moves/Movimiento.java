/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 * Un movimiento o ataque (Move en inglés; わざ Movimiento en japonés) es una
 * técnica que los Pokémon son capaces de aprender y que usan en los combates
 * con el fin de debilitar a sus oponentes. Este contenido proviene de
 * wikidex.net, y debe darse atribución a sus autores, tal como especifica la
 * licencia. Se prohíbe su uso a PlagioDex (el wiki de FANDOOM), por copiar
 * reiteradamente sin dar atribución https://www.wikidex.net/wiki/Movimiento
 *
 * @author RAFAEL CASTRO TINOCO
 */
public class Movimiento {

    enum TiposDeMovimiento {
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
    }
    //atributos
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //metodos
    public void utilizar(Pokemon usuario, Pokemon objetivo) {

    }
}
