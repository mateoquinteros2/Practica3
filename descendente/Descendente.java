/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descendente;
import java.util.Scanner;
/**
 *
 * @author Mateo Quinteros
 */
public class Descendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num1,num2,num3;
        //int[] arreglo = new int[2];
        
        System.out.println("Digite el primer numero");
        num1 = input.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = input.nextInt();
        System.out.println("Digite el tercer numero");
        num3 = input.nextInt();
        
        int [] arreglo={num1,num2,num3};
        
        System.out.println("\nEn orden descendente");
        ordSelDesc(arreglo);
        for (int num : arreglo){
            System.out.println(num);
        }
        
        
                
    }
    
    static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    
    }
}
