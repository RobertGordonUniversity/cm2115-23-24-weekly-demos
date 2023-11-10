package uk.ac.rgu.topic6.visitor;

/**
 * CarVisitor interface has a visit() method for each specific type of car - in this case,
 * Ford, Renault and Nissan.
 * It's these methods that, when implemented in a class, allows concrete objects to be recognised when previously hidden
 * by a super-type - in this case, the Car class
 */
public interface CarVisitor {
    public void visit(Ford car);
    public void visit(Renault car);
    public void visit(Nissan car);
}
