
package binarytree;

import java.util.Random;

public class Btree 
{
    private BinaryTree root;
    
    public Btree()
    {
        this.root= null;
    }
    
    public void add(int value, String Ln, String Fn)
    {
        BinaryTree newTree = new BinaryTree(value, Ln, Fn);
        
            if(this.root==null)
            {
                this.root= newTree;
            }
            else
            {
                this.root.add(newTree);
            }
        
    }
    
    public void display()
    {
        if (this.root== null)
        {
            System.out.println("Empty Tree");
        }
        else
        {
            this.root.display(0,"");
        }
    }
    
    public void displayinOrder()
    {
        if(this.root == null)
        {
            System.out.println("Empty Tree");
        }
        else
        {
            this.root.visitinOrder();
        }
    }
    public String generateString(int n)
{
    String text2= "";
    Random rng = new Random();
    for (int i = 0; i < n; i++)
    {
        int a = rng.nextInt(25)+65;
        text2= text2+ (char) a;
    }
    return text2;
}
    
}
