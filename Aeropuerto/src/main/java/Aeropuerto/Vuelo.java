/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Vuelo {

    String codigoReserva;
    String aerolinea;
    String nroVuelo;
    String ciudadSalida;
    String fechaSalida;
    String horaSalida;
    String ciudadArribo;
    String fechaArribo;
    String horaArribo;
    String asiento;
    boolean checkin;

    public Vuelo() {
        this.codigoReserva = "";
        this.aerolinea = "";
        this.nroVuelo = "";
        this.ciudadSalida = "";
        this.fechaSalida = "";
        this.horaSalida = "";
        this.ciudadArribo = "";
        this.fechaArribo = "";
        this.horaArribo = "";
        this.asiento = "";
        this.checkin = false;
    }

    public void seleccionarVuelo(String codReserva) {
        Random r = new Random();
        int opcion = r.nextInt(3) + 1;
        switch (opcion) {
            case 1:
                System.out.println("Se reservo el vuelo: JetSmart 5998 Neuquen-Cordoba 12/03/22 09:00:00-10:45:00");
                System.out.println("Codigo de reserva: " + codReserva);
                this.codigoReserva = codReserva;
                this.aerolinea = "JetSmart";
                this.nroVuelo = "5998";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "09:00:00";
                this.ciudadArribo = "Cordoba";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "10:45:00";
                this.asiento = "";
                this.checkin = false;
                break;
            case 2:
                System.out.println("Se reservo el vuelo: Latam 2269 Neuquen-Buenos Aires 12/03/22 10:00:00-11:50:00");
                System.out.println("Codigo de reserva: " + codReserva);
                this.codigoReserva = codReserva;
                this.aerolinea = "Latam";
                this.nroVuelo = "2269";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "10:00:00";
                this.ciudadArribo = "Buenos Aires";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "11:50:00";
                this.asiento = "";
                this.checkin = false;
                break;
            case 3:
                System.out.println("Se reservo el vuelo: Aerolineas Argentinas 8496 Neuquen-Buenos Aires 12/03/22 11:00:00-12:45:00");
                System.out.println("Codigo de reserva: " + codReserva);
                this.codigoReserva = codReserva;
                this.aerolinea = "Aerolineas Argentinas";
                this.nroVuelo = "8496";
                this.ciudadSalida = "Neuquen";
                this.fechaSalida = "12/03/22";
                this.horaSalida = "11:00:00";
                this.ciudadArribo = "Buenos Aires";
                this.fechaArribo = "12/03/22";
                this.horaArribo = "12:45:00";
                this.asiento = "";
                this.checkin = false;
                break;
        }
    }

    public void verDatos() {
        System.out.println("codigo reserva: " + this.codigoReserva);
//        System.out.println("Apellido Pasajero: " + this.ApellidoPasajero);
//        System.out.println("dni Pasajero: " + this.dniPasajero);
        System.out.println("aerolinea: " + this.aerolinea);
        System.out.println("nroVuelo: " + this.nroVuelo);
        System.out.println("ciudad Salida: " + this.ciudadSalida);
        System.out.println("fecha Salida: " + this.fechaSalida);
        System.out.println("hora Salida: " + this.horaSalida);
        System.out.println("ciudad Arribo: " + this.ciudadArribo);
        System.out.println("fecha Arribo: " + this.fechaArribo);
        System.out.println("horaArribo: " + this.horaArribo);
        System.out.println("asiento: " + this.asiento);
        System.out.println("checkin: " + this.checkin);
    }

    public void hacerCheckin() {
        this.checkin = true;
        this.asiento = "";
    }

}
