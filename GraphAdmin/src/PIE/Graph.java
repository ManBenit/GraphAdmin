package PIE;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import structure.BinTree;

public class Graph implements Serializable{
    private Calendar creationDate;
    private Calendar goalDate;
    private BinTree team;
    private Adviser redAdviser, blueAdviser, greenAdviser;
    private Member redLider;
    private boolean micro;
    private String dateFormat="dd/MM/yyyy hh:mm:ss";
    
    public Graph(boolean micro, Member redLider, Adviser greenAdviser, Adviser blueAdviser, Adviser redAdviser){
        creationDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
        this.micro= micro;
        this.redAdviser=redAdviser;
        this.blueAdviser=blueAdviser;
        this.greenAdviser=greenAdviser;
        this.redLider= redLider;
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
    
    public void setGoalDate(){
        goalDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
    }
    
    public void step(){
        //Advance graphic
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder("");
        int countLevel=1;
        
        if(micro)
            sb.append("Gráfica Micro-PIE\n");
        else
            sb.append("Gráfica PIE\n");
        sb.append(greenAdviser.getFullName(true)).append(": ").append(greenAdviser.getColor()).append("\n");
        sb.append(blueAdviser.getFullName(true)).append(": ").append(blueAdviser.getColor()).append("\n");
        sb.append(redAdviser.getFullName(true)).append(": ").append(redAdviser.getColor()).append("\n");
        
        
        
        
//        sb.append(redLider.getGraphicName());
//        while(countLevel!=4){
//            
//            countLevel+=1;
//        }        
        
        return sb.toString();
    }
    
    
}
