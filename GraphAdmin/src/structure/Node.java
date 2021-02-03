package structure;

import GUI.Message;
import PIE.Member;
import java.io.Serializable;
import java.util.LinkedList;

public class Node implements Serializable{
    private Member member1, member2; 
    private boolean shared;
    private Node[] childNodes= new Node[2]; //Only 2 child nodes per node
    /*
    There are a relation between mebers and index of child when it's shared place:
    - member1 to index 0 of childNodes.
    - member2 to index 1 of childNodes.
    
    When place is not chared, thanks of member1=member2, this relation doesn't affect.
    */
    
    //Not shared place
    public Node(Member member){
        this.member1= member;
        this.member2= member;
        shared=false;
    }
    
    //Shared place
    public Node(Member member1, Member member2){
        this.member1= member1;
        this.member2= member2;
        shared=true;
    }
    
    public boolean isShared(){
        return shared;
    }
    
    //Use any of the next two methods gives the same result if place is not shared
    public Member getLider1(){
        return member1;
    }
    
    public Member getLider2(){
        return member2;
    }
    
    
    public Node[] getChildren(){
        return childNodes;
    }
    
    public void setChildren(Node n1, Node n2){
        childNodes[0]=n1;
        childNodes[1]=n2;
    }
    
    //As an extra padlock, here is confirmed that  total value of place is 24000 to great or 6000 to micro
    public int getNodeValue(){
        if(shared)
            return member1.getInvestment()+member2.getInvestment();
        else
            return member1.getInvestment();
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        
        if(shared)
            sb.append(member1.getGraphicName()).append(" y\n").append(member2.getGraphicName());
        else
            sb.append(member1.getGraphicName());
        
        return sb.toString();
    }
}
