/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import java.util.*;
/**
 *
 * @author B11
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
        //Saludar al mundo
        System.out.println("Hola Mundo. Bienvenido a PROGCOM-B");
        System.out.println("Esta lloviendo?");
        Scanner play= new Scanner(System.in);
        lluvia=play.nextLine();
        
        System.out.println("Tu respuesta fue: "+lluvia);
        
        if (lluvia.equals("si")){
            System.out.println("Use sombrilla. Guarde la ropa");
        }
        else{
            System.out.println("El dia esta joya");
        }
    }   
       
}
