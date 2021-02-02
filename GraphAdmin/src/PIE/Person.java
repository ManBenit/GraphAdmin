package PIE;

import java.io.Serializable;

public class Person implements Serializable{
    private String name, lastname, mlastname, address, employment;
    private int age;
    
    public Person(String name, String lastname, String mlastname, int age, String address, String employment){
        this.name= name;
        this.lastname= lastname;
        this.mlastname= mlastname;
        this.address= address;
        this.employment= employment;
        this.age= age;
    }
    
    public String getFullName(boolean byname){
        //If byname is true, then return name lastname mlastname
        //if it's false, then return lastname mlastname name
        StringBuffer sb= new StringBuffer("");
        
        if(byname)
            sb.append(name).append(" ").append(lastname).append(" ").append(mlastname);
        else
            sb.append(lastname).append(" ").append(mlastname).append(" ").append(name);
        
        return sb.toString();
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAge(int age){
        this.age= age;
    }
    
    public void setAddress(String address){
        this.address= address;
    }
    
    public void setEmployment(String employment){
        this.employment= employment;
    }
    
    public void setName(String name){
        this.name= name;
    }
    
    public void setLastname(String lastname){
        this.lastname= lastname;
    }
    
    public void setMothLastname(String mlastname){
        this.mlastname= mlastname;
    }
    
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder("");
        sb.append(getFullName(true)).append("\n");
        sb.append(age).append(" años").append("\n");
        sb.append(address).append("\n");
        sb.append(employment);
        
        return sb.toString();
    }
}
