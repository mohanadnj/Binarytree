
package binarytree;

public class BinaryTree 
{
    private int payload;
    private String Lname;
    private String Fname;
    private BinaryTree leftTree;
    private BinaryTree rightTree;
    
    public BinaryTree(int payload, String Lname, String Fname)
    {
        this.payload= payload;
        this.Lname= Lname;
        this.Fname= Fname;
        this.leftTree= null;
        this.rightTree= null;
    }
    
    public void add(BinaryTree bt)
    {
        if(bt.payload <=this.payload)
        {
            if(this.leftTree==null)
            {
                this.leftTree=bt;
            }
            else
            {
                this.leftTree.add(bt);
            }
        }
        else
        {
            if(this.rightTree==null)
            {
                this.rightTree=bt;
            }
            else
            {
                this.rightTree.add(bt);
            }
        }
    }
    
    public void display(int level, String  position)
    {
        System.out.println(this.payload +  "(" + level + " , " + position+ " , "+ this.Lname + " , " + this.Fname + " ) " );
        if(this.leftTree != null)
        {
            this.leftTree.display(level+1, position + ((position.length()==0)?"L":",L"));
        }
        if(this.rightTree != null)
        {
            this.rightTree.display(level+1, position + ((position.length()==0)?"R":",R"));
        }
    }
    
    public void visitinOrder()
    {
        if(this.leftTree != null)
        {
            this.leftTree.visitinOrder();
        }
        System.out.println("Age:"+ this.payload +"   Name(last,first): "+ this.Lname +" "+ this.Fname);
        if(this.rightTree != null)
        {
            this.rightTree.visitinOrder();
        }
    }
    
}
