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
public class Vuelo {

    String codigoReserva;
    String ApellidoPasajero;
    String dniPasajero;
    String aerolinea;
    String nroVuelo;
    String ciudadSalida;
    String fechaSalida;
    String horaSalida;
    String ciudadArribo;
    String fechaArribo;
    String horaArribo;
    String asiento = "";
    boolean checkin = false;

    public Vuelo(String d1, String d2, String d3, String d4, String d5, String d6, String d7, String d8, String d9, String d10, String d11) {
        this.codigoReserva = d1;
        this.ApellidoPasajero = d2;
        this.dniPasajero = d3;
        this.aerolinea = d4;
        this.nroVuelo = d5;
        this.ciudadSalida = d6;
        this.fechaSalida = d7;
        this.horaSalida = d8;
        this.ciudadArribo = d9;
        this.fechaArribo = d10;
        this.horaArribo = d11;
    }

    public void verDatos() {
        System.out.println("codigo reserva: " + this.codigoReserva);
        System.out.println("Apellido Pasajero: " + this.ApellidoPasajero);
        System.out.println("dni Pasajero: " + this.dniPasajero);
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
    
    public void hacerCheckin(){
        this.checkin=true;
        this.asiento="";
    }

}
