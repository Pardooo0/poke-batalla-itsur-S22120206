/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

/**
 *
 * @author RAFAEL CASTRO TINOCO
 */
public abstract class Pokemon {

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected int xp;

    Pokemon() {
    }

    //Getters
    public int getNivel() {
        return nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public int getHP() {
       return hp;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos 
    public void recibirDanio(int danio) {
        this.hp = this.hp - danio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public abstract void atacar(Pokemon oponente, int ordinalMovimiento);
    //Devolver la lista de movimientos disponibles del pokemon.

    public abstract Enum[] getMovimientos();

    @Override
    public String toString() {

        return this.getClass().getSimpleName()
                + "{tipo:" + tipo + " hp:" + hp + "}";
    }

    

}
