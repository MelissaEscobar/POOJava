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
         *  Escriba un programa que imprima los números pares entre 1539 y el 2505 */
        int i = 0;
        for (i=1539; i<2505; i++){
            if (i%2 == 0 ){
                System.out.println(i);
            }else{
                System.out.println("n\n");                
            }
        }
    }
    
}
