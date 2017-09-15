package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        //En Netbeans taclado por estar obsoleto
        //Años (solo 1900-1999), meses (Enero = 0), dias
        Person persona = new Person("Pepito", new Date(01, 9, 15));
        System.out.println(persona.getName()+" tiene " + 
                persona.getAge()+ " años");
    }
}
