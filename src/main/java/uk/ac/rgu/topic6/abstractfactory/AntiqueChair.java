package uk.ac.rgu.topic6.abstractfactory;

/**
 * An implementation of a chair which is antique
 */
public class AntiqueChair implements Chair{

    @Override
    public String getDescription() {
        return "An antique chair";
    }
    
}
