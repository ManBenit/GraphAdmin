package PIE;

import GUI.Message;
import enums.Phase;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.TimeZone;


public class Member extends Person implements Serializable{
    private String gName;
    private Phase phase;
    private LinkedList<Guest> guests;
    private Calendar admissionDate;
    private String dateFormat="dd/MM/yyyy hh:mm:ss";
    private int investment;
    private boolean firstGoal=false;
    
    public Member(String name, String lastname, String mlastname, int age, String address, String employment, int investment) {
        super(name, lastname, mlastname, age, address, employment);
        guests= new LinkedList();
        this.investment= investment;
        admissionDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
    }
    
    public String getPhase(){
        return phase.getDescription();
    }
    
    public String getGraphicName(){
        return gName;
    }
    
    public LinkedList<Guest> getGuestsList(){
        return guests;
    }
    
    public void setPhase(Phase phase){
        this.phase= phase;
    }
    
    public void setGraphicName(String gName){
        this.gName= gName;
    }
    
    public void addGuest(Guest guest){
        guests.add(guest);
    }
    
    public void deleteGuest(Guest guest){
        guests.remove(guest);
    }
    
    public boolean isFirstGoalReached(){
        return firstGoal;
    }
    
    public String getAdmissionDate(){
        return new SimpleDateFormat(dateFormat).format(admissionDate.getTime());
    }
    
    public int getInvestment(){
        return investment;
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder("");
        
        sb.append(super.toString());
        sb.append(getPhase()).append("\n");
        
        return sb.toString();
    }
}
