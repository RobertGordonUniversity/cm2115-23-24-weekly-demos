package uk.ac.rgu.topic6.abstractfactory;
/**
 * An implementation of a table which is antique
 */
public class AntiqueTable implements Table{
    @Override
    public String getDescription() {
        return "An antique table";
    }
}
