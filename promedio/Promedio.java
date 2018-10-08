/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateo Quinteros
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String peso;
        String altura;
        String cantidad;
        double pes;
        double alt;
        double acumpeso=0;
        double acumaltura=0;
        double promedioalt;
        double promediopes;
        int cant;
        
        cantidad = JOptionPane.showInputDialog("Ingrese la canridad de personas");
        cant = Integer.parseInt(cantidad);
        
        for (int i=1; i<=cant; i++)
        {
            peso = JOptionPane.showInputDialog("Ingrese el peso de la persona "+i);
            pes = Double.parseDouble(peso);
            acumpeso=acumpeso+pes;
            altura = JOptionPane.showInputDialog("Ingrese la altura de la persona "+i);
            alt = Double.parseDouble(altura);
            acumaltura=acumaltura+alt;
            
        }
        promedioalt= acumaltura/cant;
        promediopes= acumpeso/cant;
        
        JOptionPane.showMessageDialog(null, "La altura promedio es de: "+promedioalt);
        JOptionPane.showMessageDialog(null, "EL peso promedio es de: "+promediopes);
        
        
    }
    
}
