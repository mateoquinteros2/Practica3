/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author Mateo Quinteros
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aux1=0;
        int aux2=0;
        
        for (int i=1; i<1800;)
        {
            aux1=aux1+2;
            aux2=aux2+aux1;
            System.out.print(Integer.toString(aux1));
            System.out.println("");
            aux1=aux1+3;
            aux2=aux2+aux1;
            System.out.print(Integer.toString(aux1));
            System.out.println("");
            i=aux1;
        }
        System.out.println("La suma es: "+aux2);
    }
    
}
