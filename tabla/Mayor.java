/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;



/**
 *
 * @author Mateo Quinteros
 */
public class Mayor {
    
    public void mayorElemento (double[] tipo, Double mayor, String[] nombre, String name)
    {
        
        mayor = tipo[0];
        name = nombre[0];
        
        int i;
        int k=0;
        
        for(i=0; i<tipo.length && i<nombre.length; i++){
            if(tipo[i]>mayor){ 
                mayor = tipo[i];
                name = nombre[i];
                k=i;
            }
        }
        System.out.println(name+" "+mayor);
        tipo[k]=0;
        
        mayor = tipo[0];
        name = nombre[0];
        
        for(i=0; i<tipo.length && i<nombre.length; i++){
            if(i!=k){
                if(tipo[i]>mayor){ // 
                    mayor = tipo[i];
                    name = nombre[i];
                }
            }
        }
        System.out.println(name+" "+mayor);
        
    }
    
}
