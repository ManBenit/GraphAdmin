package structure;

import PIE.Member;

public class Node {
    private Member member;
    private Node leftChild, rigthChild;
    
    public Node(Member member){
        this.member= member;
    }
    
    public void setLeftChild(Node node){
        leftChild= node;
    }
    
    public void setRigthChild(Node node){
        rigthChild= node;
    }
    
    public Member getPerson(){
        return member;
    }
    
    public Node getLeftChild(){
        return leftChild;
    }
    
    public Node getRigthChild(){
        return rigthChild;
    }
}
