package curvasc;
import acm.graphics.GTurtle;

 /*
 * @author palom
 */
public class CurvasC extends GTurtle {
    void C(int n){
       if (n==0)
          forward(40);
       else{
           C(n-1);
           right(90);
           C(n-1);
           left(90);
           
       }
   } 
    /**
     * @param args the command line arguments
     */
 public void run() {
         // Establecer el tamaño (en píxeles) de la tortuga.
        setSize(20);

        // Bajar la pluma de la tortuga para que deje un
        // rastro al momento de desplazarse.
        penDown();
        C(5);
 } 
   public static void main(String[] args) {
        // TODO code application logic here
        new CurvasC().start(); 
    }
    
}
