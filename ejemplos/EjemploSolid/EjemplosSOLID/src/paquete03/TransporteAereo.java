/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
public class TransporteAereo {
    public double tarifa;
  
    public void establecerTarifa(){
        tarifa = 100 + 0.20;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
