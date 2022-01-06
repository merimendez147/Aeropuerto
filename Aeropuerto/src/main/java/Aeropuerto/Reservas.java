/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Reservas {

    HashMap<String, Vuelo> reservas;
    int cantVuelos;
    String archivo = "/home/informatica/NetBeansProjects/Aeropuerto/Aeropuerto/src/main/java/Aeropuerto/reservas.txt";

    @SuppressWarnings("empty-statement")
    public Reservas(int cantV) {
        this.cantVuelos = cantV;
        this.reservas = new HashMap<>();
        Vuelo[] vuelos = new Vuelo[cantVuelos];
        int i = 0;
        String codigoReserva="";
        String ApellidoPasajero="";
        String dniPasajero="";
        String aerolinea="";
        String nroVuelo="";
        String ciudadSalida="";
        String fechaSalida="";
        String horaSalida="";
        String ciudadArribo="";
        String fechaArribo="";
        String horaArribo="";
        File doc = new File(archivo);
        Scanner obj = null;
        try {
            obj = new Scanner(doc);
            while (obj.hasNextLine()) {
                if (obj.hasNextLine()) {
                    codigoReserva = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    ApellidoPasajero = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    dniPasajero = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    aerolinea = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    nroVuelo = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    ciudadSalida = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    fechaSalida = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    horaSalida = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    ciudadArribo = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    fechaArribo = obj.nextLine();
                }
                if (obj.hasNextLine()) {
                    horaArribo = obj.nextLine();
                }
                vuelos[i]= new Vuelo(codigoReserva, ApellidoPasajero, dniPasajero, aerolinea, nroVuelo, ciudadSalida, fechaSalida, horaSalida, ciudadArribo, fechaArribo, horaArribo);
                reservas.put(vuelos[i].codigoReserva, vuelos[i]);
//                System.out.println("codigo reserva: " + vuelos[i].codigoReserva);
//                System.out.println("Apellido Pasajero: " + vuelos[i].ApellidoPasajero);
//                System.out.println("dni Pasajero: " + vuelos[i].dniPasajero);
//                System.out.println("aerolinea: " + vuelos[i].aerolinea);
//                System.out.println("nroVuelo: " + vuelos[i].nroVuelo);
//                System.out.println("ciudad Salida: " + vuelos[i].ciudadSalida);
//                System.out.println("fecha Salida: " + vuelos[i].fechaSalida);
//                System.out.println("hora Salida: " + vuelos[i].horaSalida);
//                System.out.println("ciudad Arribo: " + vuelos[i].ciudadArribo);
//                System.out.println("fecha Arribo: " + vuelos[i].fechaArribo);
//                System.out.println("horaArribo: " + vuelos[i].horaArribo);
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (obj != null) {
                    obj.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

    }
    
    public void verReservas(){
        reservas.keySet().forEach((var i) -> {
            System.out.println( "key: " + i + " value: ");
            reservas.get(i).verDatos();
        });
    }

}
