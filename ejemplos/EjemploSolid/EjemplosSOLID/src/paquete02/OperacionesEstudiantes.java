/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) { //Obtiene los elemento hasta el final, declarando un objeto dependiendo del tipo
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public void establecerPromedioEdadesCualitativo() {

        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioEdadesCualitativo = "Promedio Joven";
        } else if (promedioEdades < 21) {
            promedioEdadesCualitativo = "Promedio Adulto Mayor";
        }
    }

    public String obtenerPromedioEdadesCualitativo() {

        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadena = "LISTA DE ESTUDIANTES\n";
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%sNombre: %s\n", cadena,
                    estudiantes.get(i).obtenerNombre());
        }
        cadena = String.format("%sPromedio de Edades: %.2f\n"
                + "Promedio Cualitativo: %s",
                cadena, promedioEdades, promedioEdadesCualitativo);
        return cadena;
    }

}
