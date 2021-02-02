package structure;

import PIE.Member;
import java.util.LinkedHashMap;

public class BinTree {
    private Node[] root;
    private final int levels=4;
    
    public BinTree(Member member){
        root= new Node[1];
        root[0]= new Node(member);
    }
    
    public BinTree(Member member1, Member member2){
        root= new Node[2];
        root[0]= new Node(member1);
        root[1]= new Node(member2);
    }
    
    public Node[] getRoot(){
        return root;
    }
    
    public int getLevels(){
        return levels;
    }
    
    
}
