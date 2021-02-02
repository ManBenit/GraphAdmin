package PIE;

import enums.Color;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.TimeZone;

public class Adviser extends Person implements Serializable{
    private String gName;
    private Color color;
    private LinkedList<Person> guests;
    private LinkedList<Member> godchildren;
    private Calendar admissionDate;
    private Calendar startAdviserDate;
    private String dateFormat="dd/MM/yyyy hh:mm:ss";
    
    public Adviser(String name, String lastname, String mlastname, int age, String address, String employment) {
        super(name, lastname, mlastname, age, address, employment);
        guests= new LinkedList();
        godchildren= new LinkedList();
        startAdviserDate= new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
    }
    
    public String getColor(){
        return color.getDescription();
    }
    
    public String getGraphicName(){
        return gName;
    }
    
    public LinkedList<Person> getGuestsList(){
        return guests;
    }
    
    public LinkedList<Member> getGodchildren(){
        return godchildren;
    }
    
    public void setColor(Color color){
        this.color= color;
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
    
    public String getGodchildrenStatus(){
        StringBuilder sb= new StringBuilder("");
        
        for(Member m: godchildren){
            sb.append("*******************************");
            sb.append(m.getFullName(true)).append("\n");
            sb.append(m.getGraphicName()).append("\n");
            sb.append(m.getAdmissionDate());
        }
        
        return sb.toString();
    }
    
    public String getAdmissionDate(){
        return new SimpleDateFormat(dateFormat).format(admissionDate.getTime());
    }
    
    public String getStartAdviserDate(){
        return new SimpleDateFormat(dateFormat).format(startAdviserDate.getTime());
    }
}
