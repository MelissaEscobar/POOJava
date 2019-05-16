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
public class Tablero {
    private final Casilla[][] casillas;

    public Tablero() {
        casillas = new Casilla[8][];
        for (int i = 0; i < 8; i++) {
            casillas[i] = new Casilla[8];
            for (int j = 0; j < 8; j++) {
                casillas[i][j] = new Casilla(Color.BLANCO, i, j);
            }
        }
    }
    
}
