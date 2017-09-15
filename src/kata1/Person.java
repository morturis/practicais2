package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_IN_A_YEAR = (long)(1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        //Edad como resta 
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()
                -birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milisegundos){
        return milisegundos/MILLISECONDS_IN_A_YEAR;
    }
}
