package uk.ac.rgu.topic6.abstractfactory;

/**
 * A concrete factory where the method implementations return modern versions
 */
public class ModernFurnitureFactory implements AbstractFurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Lamp createLamp() {
        return new ModernLamp();
    }
    
}
