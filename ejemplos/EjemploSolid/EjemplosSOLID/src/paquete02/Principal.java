/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> estudiantes = new ArrayList();
        Persona p1 = new Persona("Pedrito Paladinez",24);
        Persona p2 = new Persona("Pablito Peralta",25);
        Persona p3 = new Persona("Paco Perez",14);
        estudiantes.add(p3);
        estudiantes.add(p2);
        estudiantes.add(p1);
        
        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        op1.establecerEstudiante(estudiantes);
        op1.establecerPromedioEdades();
        op1.establecerPromedioEdadesCualitativo();
        System.out.println(op1);
        
    }
}
