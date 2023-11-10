package uk.ac.rgu.topic7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){

        List<Person> people = new LinkedList<>();

        Person p1 = new Person("Peter", "Parker", 25);
        Person p2 = new Person("Miles", "Morales", 17);
        Person p3 = new Person("Steve", "Rogers", 120);
        Person p4 = new Person("Carol", "Danvers", 40);
        Person p5 = new Person("Wanda", "Maximoff", 30);
        
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        System.out.println(people);
        List<Person> filtered = people.stream()
                                      .filter((person) -> person.getAge() < 31)
                                      .collect(Collectors.toList());

        System.out.println(filtered);

        // for(Person p : people){
        //     System.out.println(p);
        // }

        Map<String, ArrayList<Person>> peopleMap = new HashMap<>();


        if(peopleMap.get("Spider-Man") == null){
            peopleMap.put("Spider-Man", new ArrayList<>());
        }

        peopleMap.get("Spider-Man").add(p1);

        if(peopleMap.get("Spider-Man") == null){
            peopleMap.put("Spider-Man", new ArrayList<>());
        }

        peopleMap.get("Spider-Man").add(p2);

        peopleMap.put("Captain America", new ArrayList<>());



        



        

    }
}
