/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class GestorCheckin {

    int cantidadPuestosCheckIn;
    int cantidadMaxPasajeros;
    Semaphore[] filaCheckIn;
    Semaphore[] dejarCheckIn;
    Semaphore[] esperaHall;

    public GestorCheckin(int cantMP, int cantPCI) {
        this.cantidadPuestosCheckIn = cantPCI;
        this.cantidadMaxPasajeros = cantMP;
        this.filaCheckIn = new Semaphore[cantidadPuestosCheckIn];
        for (int i = 0; i < filaCheckIn.length; i++) {
            this.filaCheckIn[i] = new Semaphore(0);
        }
        this.dejarCheckIn = new Semaphore[cantidadPuestosCheckIn];
        for (int i = 0; i < dejarCheckIn.length; i++) {
            this.dejarCheckIn[i] = new Semaphore(0);
        }
        this.esperaHall = new Semaphore[cantidadPuestosCheckIn];
        for (int i = 0; i < esperaHall.length; i++) {
            this.esperaHall[i] = new Semaphore(0);
        }
    }

}
