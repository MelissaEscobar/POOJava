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
public class Casilla {
    private final Color color;
    private final int fila;
    private final int columna;
    
    private boolean ocupada;

    public Casilla(Color color, int fila, int columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
        this.ocupada = false;
    }

    public Color getColor() {
        return color;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

}
