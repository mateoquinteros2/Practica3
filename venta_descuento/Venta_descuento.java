/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_descuento;
import java.awt.Graphics;   // importar la clase Graphics 
import javax.swing.*;       // importar el paquete javax.swing 

/**
 *
 * @author Mateo Quinteros
 */
public class Venta_descuento extends JApplet{

    /**
     * @param args the command line arguments
     */
    int[] obsequios = new int[10];
    double[] monto = new double[10];
    double[] descuento = new double[10];
    String cantidad;
    int cant;
    double precio=1.5;
    int aux=0;
    
    
    //public static void main(String[] args) {
       
    //}
    
    @Override
    public void init()
    {
    
        for(int i = 0; i<=9; i++)
        {
            cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de articulos de la venta "+(i+1));
            cant  = Integer.parseInt(cantidad);
            
            monto[i]= cant*precio;
            
            if(cant==36)
            {
                descuento[i]=cant*precio*0.10;
                obsequios[i]=3;
            }else
            {
                descuento[i]=0;
                obsequios[i]=0;
            }
            
        }//fin de for
    
    }//fin de init
    
    @Override
    public void paint(Graphics g)
    {
        super.paint( g ); 
        
        for (int i=0; i<=9;i++)
        {
            aux=aux+25;
            g.drawString( "Monto: " + monto[i]+" Descuento: "+descuento[i]+" Obsequios: "+obsequios[i], 25, aux );
            
        }
    }
    
}
