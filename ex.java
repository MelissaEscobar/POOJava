package chapt2;

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
        
        /**TALLER 
         *  Escriba un programa que imprima los números del 1 al 100 que no terminen en 2 ni en 5.
         */
         
        int i = 0;
        for (i=1; i<101; i++){
            if (i%10 == 2 || i%10 ==5){
                System.out.println("n\n");
            }else{
                System.out.println(i+"\n");                
            }
        }
    }
    
}