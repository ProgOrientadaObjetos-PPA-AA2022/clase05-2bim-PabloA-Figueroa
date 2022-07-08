/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteMaritimo extends Transporte {

    public double tarifa;

    @Override
    public void establecerTarifa(double x) {
        tarifa = x;
    }

    @Override
    public String toString() {
        String cadena = String.format("Transporte MARITIMO: %.2f",
                tarifa);
        return cadena;
    }
}
