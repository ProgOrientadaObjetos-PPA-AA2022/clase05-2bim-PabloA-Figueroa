/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author SALA I
 */
public class Principal2 {
    //guaradar
    public static void main(String[] args) {
        String nombre = "C:\\Users\\SALA A\\Desktop\\clase05-2bim-PabloA-Figueroa\\leeer.txt"; 
        ObjectOutputStream hola = new ObjectOutputStream();
        hola.writeObject(hola);
    }
      
}
