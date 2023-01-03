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
public class Tree {
    
    class NODE {

        int data;
        NODE Right;
        NODE left;

    }
    NODE Root;

    //for isempty;
    public boolean isEmpty() {

        if (Root == null) {
            return true;
        }
        return false;

    }

    // Root node 
    public void Root(int value) {

        if (!isEmpty()) {

            System.out.println("already insert value");
        } else {
            NODE n = new NODE();
            n.data = value;
            Root = n;

        }

    }

// insert left 
    public void insertlift(int key, int value) {

        if (isEmpty()) {

            System.out.println("tree is empty");
        } else {
            NODE t = search(Root, key);
            if (t != null) {

                if (t.left == null) {
                    NODE n = new NODE();
                    n.data = value;
                    t.left = n;

                } else {

                    System.out.println("value alrady inserted");
                }

            } else {

                System.out.println("key not found");
            }

        }

    }

    public void insertright(int key, int value) {
        NODE n = new NODE();
        n.data = value;
        if (isEmpty()) {

            System.out.println("tree is empty");
        } else {
            NODE t = search(Root, key);
            if (t != null) {

                if (t.Right == null) {

                    t.Right = n;

                } else {

                    System.out.println("value alrady inserted");
                }

            } else {

                System.out.println("key not found");
            }

        }

    }
    //search
    public NODE search(NODE n, int key) {

        NODE t = null;

        if (n != null) {

            if (n.data == key) {

                t = n;

            } else 
            {
                t = search(n.left, key);
                if (t == null) {

                    t = search(n.Right, key);

                }

            }

        }
        return t;
    }

//inOrderTraversal
    public void inOrder(NODE n) {

        if (n == Root) {

            System.out.print("");

        } 
            
        if (n != null) {
            inOrder(n.left);
            System.out.print("=>" + n.data);

            inOrder(n.Right);

        }

    }

}
