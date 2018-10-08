/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocidad;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateo Quinteros
 */
public class Velocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String distancia;
        Double dis;
        Double monto=30.0;
        Double aux;
        
        distancia = JOptionPane.showInputDialog("Ingrese el recorrido (Km)");
        dis = Double.parseDouble(distancia);
        
        if(dis<=300)
        {
            JOptionPane.showMessageDialog(null, "Su monto a pagar es de: "+monto);
            
        }
        if(dis>300 && dis<=1000)
        {
            aux=dis-300;
            aux=aux*0.15;
            JOptionPane.showMessageDialog(null, "Su monto a pagar es de: "+(monto+aux));
            
        }
        if(dis>1000)
        {
            aux=dis-300;
            aux=aux*0.10;
            JOptionPane.showMessageDialog(null, "Su monto a pagar es de: "+(monto+aux));
            
        }
    }
    
}
