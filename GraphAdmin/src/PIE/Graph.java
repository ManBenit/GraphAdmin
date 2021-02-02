package PIE;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import structure.BinTree;

public class Graph {
    private Calendar creationDate;
    private Calendar goalDate;
    private BinTree team;
    private Adviser redAdviser, blueAdviser, greenAdviser;
    private boolean micro;
    private String dateFormat="dd/MM/yyyy hh:mm:ss";
    
    public Graph(boolean micro, Member redLider){
        creationDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
        this.micro= micro;
        team= new BinTree(redLider);
    }
    
    public String getCreationDate(){
        return new SimpleDateFormat(dateFormat).format(creationDate.getTime());
    }
    
    public String getGoalDate(){
        if(goalDate!=null)
            return new SimpleDateFormat(dateFormat).format(goalDate.getTime());
        else
            return "Sin concluir\n";
    }
    
    public void setRedAdviser(Adviser adviser){
        redAdviser=adviser;
    }
    
    public void setBlueAdviser(Adviser adviser){
        blueAdviser=adviser;
    }
    
    public void setGreenAdviser(Adviser adviser){
        greenAdviser=adviser;
    }
    
    public void setGoalDate(){
        goalDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
    }
    
    public void step(){
        //Advance graphic
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder("");
        
        if(micro)
            sb.append("Gráfica Micro-PIE\n");
        else
            sb.append("Gráfica PIE\n");
        sb.append(greenAdviser.getFullName(true)).append(": ").append(greenAdviser.getColor()).append("\n");
        sb.append(blueAdviser.getFullName(true)).append(": ").append(blueAdviser.getColor()).append("\n");
        sb.append(redAdviser.getFullName(true)).append(": ").append(redAdviser.getColor()).append("\n");
        
        
        return sb.toString();
    }
    
    
}
