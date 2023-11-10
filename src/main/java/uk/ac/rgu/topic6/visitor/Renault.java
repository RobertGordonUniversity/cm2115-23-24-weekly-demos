package uk.ac.rgu.topic6.visitor;

public class Renault extends Car{

    /**
     * A method that is only on Renault objects
     */
    public void someRenaultMethod(){
        System.out.println("This is a method on a Renault");
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
    
}
