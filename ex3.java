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
        
        /**Obtener la entrada del usuario usando los argumentos de línea de comandos para imprimir todos los argumentos en pantalla.
            Por ejemplo, si el usuario ha introducido, java Hola mundo que es todo . Su programa debe imprimir
            Hola
            mundo
            que
            es
            todo */
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.print("Por favor ingrese su texto: ");
        try{
            String c = "";
            c = dataIn.readLine();
            for(int i=0; i< c.length(); i++){
                if (c.substring(i)== " "){
                    System.out.println("\n");                     
                }else{
                    System.out.print(c.substring(i));
                }
            }     
            
            
        }catch(IOException e){
            System.out.print("Error");
        }
        
        
    }
    
}
