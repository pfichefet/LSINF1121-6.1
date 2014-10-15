import java.util.*;
import java.util.ArrayList;
import java.util.List;
/**
 * class LinkedRBinaryTree 
 * 
 * author cedric vanden bulcke
 * 
 */
public class LinkedRBinaryTree<E>
{   
    // variables 
    protected BTPosition<E> root;
    private int size;
    // constructor : create an empty tree
    public LinkedRBinaryTree() 
    {
        this.root = null;
        this.size = 0;
    }
    
    public int size() 
    {
        return size;
    }
    
    /**
     * @pre this is not empty.
     * @post return a reference to the tree root.
     */
    public BTPosition<E> root() 
    {
        return root;
    }
    
    /**
     * @pre this is not empty.
     * @post return a reference to the left subtree.
     */
    public BTPosition<E> leftTree(BTPosition<E> node) {
        return node.getLeft();
    }
    
    /**
     * @pre this is not empty.
     * @post return a reference to the right subtree.
     */
    public BTPosition<E> rightTree(BTPosition<E> node) {
        return node.getRight();
    }
    
    /**
     * @pre -
     * @post return true if this is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * @pre this is not empty
     * @post return true if this is reduced to a leaf (External Node), 
     *       false otherwise
     */
    public boolean isLeaf(BTPosition<E> node) {
        return (node.getLeft() ==null && node.getRight() ==null && node.getElement() == null);
    }
    // setters
    
    /**
     * @pre -
     * @post an iterable collection of the positions of this, 
     *       following an inorder traversal, is returned. 
     */  
    public Iterator<BTPosition<E>> positions() {
        List<BTPosition<E>> li = new ArrayList<BTPosition<E>>();
        Iterator<BTPosition<E>> iter = null;
        
        help(root, li);
        
        iter =  li.iterator();
        
        return iter;
    }
    /**
     *  recursive function to help the position() function 
     *  
     */
    public void help(BTPosition<E> root, List<BTPosition<E>> list) {
        if(isLeaf(root))
        { return; }
        
        if(root.getLeft() != null ) {
            help(root.getLeft() , list);
        }
        
        list.add(root);
        
        if(root.getRight() != null) {
            help(root.getRight() , list);
        }
    }
}
