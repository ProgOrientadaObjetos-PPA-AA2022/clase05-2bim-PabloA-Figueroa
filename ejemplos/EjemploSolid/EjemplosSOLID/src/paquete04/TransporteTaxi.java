/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteTaxi extends Transporte {
    private String cooperativaTaxi;
    
    
    public void establecerCooperativaTaxi(String n){
        cooperativaTaxi = n;
    }
    
    
    @Override
    public void establecerTarifa(double x){
        tarifa = x;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTaxi;
    }
        @Override
    public String toString() {

        String cadena = String.format("Transporte TAXI: %.2f",
                tarifa);
        return cadena;
    }
    
}
