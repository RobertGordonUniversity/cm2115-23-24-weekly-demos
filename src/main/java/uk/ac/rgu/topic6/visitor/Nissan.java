package uk.ac.rgu.topic6.visitor;

public class Nissan extends Car{

    /**
     * A method that is only on Nissan objects
     */
    public void someNissanMethod(){
        System.out.println("This is a method on a Nissan");
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
