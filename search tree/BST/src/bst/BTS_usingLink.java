/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author M-H-K
 */
public class BTS_usingLink {
    
    class NODE{
    
    int  data;
    NODE left;
    NODE right;        
    
    
}
    NODE Root;
    
    //is empty
   public boolean isEmpty(){
       
       if(Root==null){
           
           return true;
           
       }
       else
       {
           return false;
       }
       
       
       
       
   } 
   
   
   // insert root 
   
    public void insert(int value) {
        NODE n = new NODE();
        n.data = value;
        if (isEmpty()) {

            Root = n;
        } else {
            NODE t = Search(Root, n.data);
            if (t.data > n.data) {
                t.left = n;
            } else {
                t.right = n;
            }
        }
    }

   
   
   
   
   
   
   
   
   
   // dearch method
    public NODE Search(NODE n, int key) {
        NODE _t = null;
        if (n != null) {
            if (n.data <= key) {
                if (n.right != null) {
                    _t = Search(n.right, key);
                } else {
                    return n;
                }
            } else if (n.data > key) {
                if (n.left != null) {
                    _t = Search(n.left, key);
                } else {
                    return n;
                }
            }
        }
        return _t;
    }

   
       public NODE findDNODE(NODE n) {
        NODE _t = n;
        if (n != null) {
            while (_t.left.left != null) {
                _t = _t.left;
            }
        }
        return _t;
    }

    public void inOrder(NODE n) {
        if (n != null) {

            inOrder(n.left);
            System.out.print(n.data + "=>");
            inOrder(n.right);
        }
    }

    public void preOrder(NODE n) {
        if (n != null) {
            System.out.print(n.data + "=>");
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrder(NODE n) {
        if (n != null) {

            preOrder(n.left);
            preOrder(n.right);
            System.out.print(n.data + "=>");
        }
    
    
    }

   
   
   
   
   
    
}
/9+