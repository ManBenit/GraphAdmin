package enums;

import java.io.Serializable;

public enum Phase implements Serializable{
    YELLOW("Fase 1: Amarillo."),
    GREEN("Fase 2: Verde."),
    BLUE("Fase 3: Azul."),
    RED("Fase 4: Rojo.");
    
    private String description;
    
    private Phase(String description){
        this.description= description;
    }
    
    public String getDescription(){
        return description;
    }
}
