package uk.ac.rgu.topic6.abstractfactory;

/**
 * A concrete factory where the method implementations return antique versions
 */
public class AntiqueFurnitureFactory implements AbstractFurnitureFactory{

    @Override
    public Chair createChair() {
        return new AntiqueChair();
    }

    @Override
    public Table createTable() {
        return new AntiqueTable();
    }

    @Override
    public Lamp createLamp() {
        return new AntiqueLamp();
    }
    
}
