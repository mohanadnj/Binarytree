
package binarytree;
import java.util.Random;
public class Driver 
{    
    public static void main(String[] args) 
    {
                Btree bt = new Btree();
                Random r = new Random();
                Btree st = new Btree();
                for (int i = 0; i<100; i++)
                {
                    
                    bt.add(r.nextInt(80)+5, st.generateString(7), st.generateString(5));
                }
                bt.displayinOrder();
                
                
    }
    
    
}
