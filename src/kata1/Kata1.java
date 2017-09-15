package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        //notese la forma de instanciar los calendar
        Calendar date = GregorianCalendar.getInstance();
        date.set(2001, 9, 12);
        
        Person persona = new Person("Pepe", date);
        System.out.println(persona.getName()+" tiene " + 
                persona.getAge()+ " años");
    }
}
