/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

/**
 *
 * @author informatica
 */
public class Pasajero implements Runnable {

    String nombrePasajero;
    String dniPasajero;
    String codigoReserva;
    Vuelo vuelo;

    public Pasajero(String n, String dni, String cr, Vuelo v) {
        this.nombrePasajero = n;
        this.dniPasajero = dni;
        this.codigoReserva = cr;
        this.vuelo = v;
    }

    public void run() {

    }
}
