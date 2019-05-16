/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

/**
 *
 * @author utp: odau
 */
public class Ajedrez {

    private Jugador[] jugadores;
    private Tablero tablero;
    private Cronometro cronometro;

    private int turno;
    private boolean terminado;

    public Ajedrez() {
        jugadores = new Jugador[2];
        tablero = new Tablero();
        cronometro = new Cronometro();
        turno = 0;
        terminado = false;
    }

    public Ajedrez(Jugador jugador1, Jugador jugador2) {
        this();
        this.jugadores[0] = jugador1;
        this.jugadores[1] = jugador2;
    }

    public void jugar() {
        jugadores[0].setAjedrez(this);
        jugadores[1].setAjedrez(this);
        cronometro.iniciar();
        do {
            jugadores[turno].jugar();
            // Validar si hay Jaque Mate y terminar
            if (terminado) {
                turno = (turno == 0 ? 1 : 0);
                break;
            } else if (validarJaqueMate()) {
                terminado = true;
                break;
            } else if (validarTablas()) {
                break;
            }
            // Sino, cambiar turno
            cambioTurno();

        } while (!terminado);
        cronometro.parar();

        //TODO: Cambiarlo de lugar
        if (terminado) {
            System.out.println("El Jugador "
                    + jugadores[turno].getNombre() + " ha ganado");
        } else {
            System.out.println("Los jugadores han quedado en tablas");
        }
    }

    public void cambioTurno() {
        turno = (turno == 0 ? 1 : 0);
        cronometro.cambio();
    }

    private boolean validarJaqueMate() {
        //TODO: Validar si el jugador contrario ha quedado en Jaque Mate
        return false;
    }

    private boolean validarTablas() {
        //TODO: Validar si los jugadores se han quedado sin posibilidad de ganar
        return false;
    }

    public void rendirse() {
        terminado = true;
    }

}
