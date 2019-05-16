/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

/**
 *
 * @author utp
 */
public abstract class Ficha {
    private Casilla casilla;
    private Color color;

    public Ficha(Color color) {
        this.color = color;
    }
    
    public abstract void mover();
    public abstract void comer();

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

}
