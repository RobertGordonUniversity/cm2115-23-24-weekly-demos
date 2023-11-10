package uk.ac.rgu.topic6.visitor;

public abstract class Car {
    /* Guarantees that all concrete cars can accept a CarVisitor object */
    public abstract void accept(CarVisitor visitor);
}
