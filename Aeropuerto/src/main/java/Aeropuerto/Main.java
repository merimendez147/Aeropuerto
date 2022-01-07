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
public class Main {

    public static void main(String[] args) {
        int cantPasajeros = 50;
        Datos datos = new Datos(cantPasajeros);
        String nombrePasajero = "", dniPasajero = "", codigoReserva = "";
        Thread[] pasajeros = new Thread[cantPasajeros];
        for (int i = 0; i < pasajeros.length; i++) {
            nombrePasajero = datos.nombre(i);
            dniPasajero = datos.dni(i);
            codigoReserva = datos.codigoReserva(i);
            Vuelo vuelo = new Vuelo();
            vuelo.seleccionarVuelo(codigoReserva);
            pasajeros[i] = new Thread(new Pasajero(nombrePasajero, dniPasajero, codigoReserva, vuelo));
            pasajeros[i].start();
        }
//        Reservas reservas = new Reservas(16);
//        reservas.verReservas();
    }
}
