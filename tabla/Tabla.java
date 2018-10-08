/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateo Quinteros
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Double termicomayor=0d;
        Double electricomayor=0d;
        String name = null;
        
        int cantidad;
        String aux1;
       
        aux1=JOptionPane.showInputDialog("Cuantos desea agregar");
        cantidad = Integer.parseInt(aux1);
        
        String[] nombres = new String[cantidad];
        double[] termico = new double[cantidad];
        double[] electrico = new double[cantidad];
        
        for(int i=0;i<cantidad;i++)
        {
            
            aux1=JOptionPane.showInputDialog("Ingrese el nombre");
            nombres[i]=aux1;
            
            aux1=JOptionPane.showInputDialog("termico");
            termico[i]=Double.parseDouble(aux1);
            
            aux1=JOptionPane.showInputDialog("electrico");
            electrico[i]=Double.parseDouble(aux1);
            
        }
        
        Mayor mayor = new Mayor();
        
        System.out.println("Conductores termicos");
        
        mayor.mayorElemento(termico, termicomayor, nombres, name);
        
        System.out.println("Conductores electricos");
        
        mayor.mayorElemento(electrico, electricomayor, nombres, name);
        
    }
    
}
    
