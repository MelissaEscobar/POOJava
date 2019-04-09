
package chapt2;

import java.io.*;
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
        
        /**Obtener dos números por parte del usuario utilizando los argumentos de la línea de
        comandos e imprimir la suma, la resta, la multiplicación y la división de los dos números.
        Por ejemplo, si el usuario ha introducido, java OperacionesAritmeticas 20 4

        su programa debe imprimir
        suma = 24
        resta = 16
        multiplicación = 80
        división = 5 */
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.print("Por favor ingrese los dos numeros: ");
        try{
            int c, d;
            
            c = Integer.parseInt(dataIn.readLine());
            d = Integer.parseInt(dataIn.readLine());
            
            System.out.print("suma= "+ Integer.toString(c+d)+ "\n"+
                             "resta= " + Integer.toString(c-d)+ "\n"+
                             "multiplicacion= " + Integer.toString(c*d)+ "\n"+    
                             "division= " + Integer.toString(c/d)+ "\n"                   
                    );
           
            
            
        }catch(IOException e){
            System.out.print("Error");
        }
        
        
    }
    
}
