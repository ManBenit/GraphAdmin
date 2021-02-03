package structure;

import PIE.Member;
import java.io.Serializable;
import java.util.LinkedHashMap;

public class BinTree implements Serializable{
    private Node root;
    private final int levels=4;
    
    
    
    public BinTree(Node root){
        this.root= root;
    }
    
    public Node getRoot(){
        return root;
    }
    
    public int getLevels(){
        return levels;
    }
    
    
}
