package Asugnment2.asigment;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Empolyer("Ringo", "Starr", "Empoyer", 51111));
        people.add(new Empolyer("Tolebi", "Baitasov", "Startuper", 99999));
        people.add(new Student("S@ken", "Oralkhan", 4.0001));
        people.add(new Empolyer("Askar", "Khaimuldin", "ThebestTeacher", 999999));
        people.add(new Student(  "Zhalgas"  ,"Bolatov" , 3.999999));
        people.add(new Empolyer("Askar", "Khaimuldin", "ThebestTeacher", 999999));

        Collections.sort(people);
        printData(people);
    }

    public static void printData( Iterable <Person> people) {
        for (Person p:people){
            System.out.println(p );
        }
    }
}
