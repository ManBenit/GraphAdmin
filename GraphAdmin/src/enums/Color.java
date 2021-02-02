package enums;

import java.io.Serializable;

public enum Color implements Serializable{
    GREEN("Asesor verde."),
    BLUE("Asesor azul."),
    RED("Asesor rojo.");
    
    private String description;
    
    private Color(String description){
        this.description= description;
    }
    
    public String getDescription(){
        return description;
    }
}
