/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

/**
 *
 * @author M-H-K
 */
public class BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Tree n=new Tree();
        n.Root(10);
        
        n.insertlift(10, 12);
        n.insertright(10,20);
        
         n.insertlift(20, 30);
        n.insertright(20,21);
      
      n.inOrder(n.Root);
      
    }
    
}
