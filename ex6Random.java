package chapt2;

import java.io.*;
import java.util.Random;
/**
 *
 * @author Familia
 */
public class Chapt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        try{
            int  c;
            int r = (int) (Math.random() * 100) + 1;
            
            StringBuffer b = new StringBuffer(" ");
            boolean end = true;
            
            System.out.print("Por favor ingrese un numero entre 1 y 100, intentando adivinar el que genera el programa: ");
             c = Integer.parseInt(dataIn.readLine());
             
             while(end){
                 if(r == c){
                     System.out.print("Felicidades, ha ingresado el número correcto \n");                                              
                     end = false;
                 }else{
                     if(c<r){
                         System.out.print("El numero ingresado es menor, ingrese otro numero nuevo "); 
                         c= Integer.parseInt(dataIn.readLine());
                     } if(c>r){
                         System.out.print("El numero ingresado es mayor, ingrese otro numero nuevo "); 
                         c= Integer.parseInt(dataIn.readLine());                         
                     }
                 }
             }                
            
            
           