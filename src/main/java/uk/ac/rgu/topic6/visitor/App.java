package uk.ac.rgu.topic6.visitor;

public class App {
    
    public static void main(String[] args){

        /* An array of specific cars - polymorphism allows them to be stored in a Car[] array */
        Car[] cars = {new Ford(), new Renault(), new Nissan()};

        /* A concrete car service visitor */
        CarVisitor visitor = new CarServiceVisitor();

        /* Iterate over the array, passing the visitor object to each car */
        for(Car c : cars){
            c.accept(visitor);
            System.out.println();
        }
    }
}
