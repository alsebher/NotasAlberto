
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno Mañana
 */
public class PruebaNotasAlberto {
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la nota por teclado: ");
        int nota = ent.nextInt();
        if(nota>=0 && nota<5){
            System.out.println("El alumno está suspenso");
            
        }else if(nota>=5 && nota<6){
            System.out.println("El alumno ha sacado un Suficiente");
        
        }else if(nota>=6 && nota<7){
            System.out.println("El alumno ha sacado un Bien");
        }else if(nota>=7 && nota<9){
            System.out.println("El alumno ha sacado un Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("El alumno ha sacado un Sobresaliente");
        }else{
            System.out.println("Por favor, introduzca una nota válida entre 0 y 10");
        }
        
    }
    
}
