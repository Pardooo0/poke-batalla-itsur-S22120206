/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author LMC Alumno
 */
public class BolaSombra extends MovimientoEspecial {

    public BolaSombra() {
        this.tipo = Movimiento.TiposDeMovimiento.FANTASMA;
        this.potencia = 80;
        this.precision = 100;
        this.puntosPoder = 15;
    }
}
