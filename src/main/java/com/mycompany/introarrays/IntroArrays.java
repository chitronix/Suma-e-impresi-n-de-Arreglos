/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introarrays;

/**
 *
 * @author repty
 */
public class IntroArrays {

    public static void main(String[] args) {
       
       //declaracion de arreglos
        int[]numeros;
        
       //inicializar el arreglo con valores 
        numeros=new int [5];
        
       //valores 
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;
        
        //imprimir los valores del arreglo-array sin siclo for
        
        //System.out.println("EL ELEMENTO DE INDICE 0:"+numeros[0]);
        //System.out.println("EL ELEMENTO DE INDICE 1:"+numeros[1]);
        //System.out.println("EL ELEMENTO DE INDICE 2:"+numeros[2]);
        //System.out.println("EL ELEMENTO DE INDICE 3:"+numeros[3]);
        //System.out.println("EL ELEMENTO DE INDICE 4:"+numeros[4]);
     
        
        //SUMA estatica elementos por elementos
        //int suma=numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];   
      // System.out.println("la sunma del array es:"+suma); 
    
      
      
      //suma de arreglo con ciclo for
      
      //int suma=0;
      //for(int i=0;i<numeros.length;i++){
       //suma+=numeros[i];
      //}
      //System.out.println("La suma con ciclo for es:"+suma);
          
         
     
      for(int i=0; i<numeros.length;i++){
          System.out.println("los numeros son:"+i+numeros[i]);
          
      }
      int suma=0;
      for(int i =0;i<numeros.length; i++){
          suma+=numeros[i];
      }
      System.out.println("suma del ciclo for es:"+suma);
    }
}

