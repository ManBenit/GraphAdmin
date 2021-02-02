package graphadmin;

import PIE.Member;
import enums.Phase;

public class GraphAdmin {
    public static void main(String[] args) {
        Member m= new Member("", "", "", 0, "", "", 0);
        System.out.println(m.getAdmissionDate());
    }
    
}
