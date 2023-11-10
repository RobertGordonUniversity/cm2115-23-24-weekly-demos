package uk.ac.rgu.topic6.visitor;

public class CarServiceVisitor implements CarVisitor {

    @Override
    public void visit(Ford car) {
        System.out.println("Performing a service on a Ford");
        car.someFordMethod();
    }

    @Override
    public void visit(Renault car) {
        System.out.println("Performing a service on a Renault");
        car.someRenaultMethod();
    }

    @Override
    public void visit(Nissan car) {
        System.out.println("Performing a service on a Nissan");
        car.someNissanMethod();
    }
    
}
