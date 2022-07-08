/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean condicion = true;
        ArrayList<Transporte> lista = new ArrayList<>();

        while (condicion) {
            System.out.println("Ingrese el tipo de vehiculo que Quiere ingresar");
            System.out.println("BUS       (1)");
            System.out.println("TAXI      (2)");
            System.out.println("AEREO     (3)");
            System.out.println("MARITIMO  (4)");
            int puntero = entrada.nextInt();
            if (puntero == 1) {
                TransporteBus bus = new TransporteBus();
                System.out.println("Ingrese el valor de la Tarifa");
                double tar = entrada.nextDouble();
                bus.establecerCooperativaBus("24 Mayo");
                bus.establecerTarifa(tar);
                lista.add(bus);
                System.out.println("Se a Creado un  Bus");
            } else if (puntero == 2) {
                TransporteTaxi taxi = new TransporteTaxi();
                System.out.println("Ingrese el valor de la Tarifa");
                double tar = entrada.nextDouble();
                taxi.establecerCooperativaTaxi("Yahuarcuna");
                taxi.establecerTarifa(tar);
                lista.add(taxi);
                System.out.println("Se a Creado un  Taxi");
            } else if (puntero == 3) {
                TransporteAereo avion1 = new TransporteAereo();
                System.out.println("Ingrese el valor de la Tarifa");
                double tar = entrada.nextDouble();
                avion1.establecerTarifa(tar);
                lista.add(avion1);
                System.out.println("Se a Creado un  Avion");
            } else if (puntero == 4) {
                TransporteMaritimo marino1 = new TransporteMaritimo();
                System.out.println("Ingrese el valor de la Tarifa");
                double tar = entrada.nextDouble();
                marino1.establecerTarifa(tar);
                lista.add(marino1);
                System.out.println("Se a Creado un Objeto Submanrino");
            } else {
                System.out.println("Valor Fuera de Rango");
            }
            entrada.nextLine();
            System.out.println("Ingrese (SI) si desea salir del programa ");
            String salir = entrada.nextLine();
            if (salir.equals("s") || salir.equals("S")) {
                condicion = false;
            }
        }
        TiposTransporte transp1 = new TiposTransporte();
        transp1.establecerTransportes(lista);
        transp1.establecerPromedioTarifas();
        System.out.println(transp1);
    }

}
