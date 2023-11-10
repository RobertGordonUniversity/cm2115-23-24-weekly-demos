package uk.ac.rgu.topic6.visitor;

public class Ford extends Car{

    /**
     * A method that is only on Ford objects
     */
    public void someFordMethod(){
        System.out.println("This is a method on a Ford");
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
    
}
