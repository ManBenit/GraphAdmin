package PIE;

import java.io.Serializable;

public class Guest extends Person implements Serializable{
    public boolean confirmedCap;

    public Guest(String name, String lastname, String mlastname, int age, String address, String employment) {
        super(name, lastname, mlastname, age, address, employment);
    }
}
