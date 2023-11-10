package uk.ac.rgu.topic6.abstractfactory;

/**
 * AbstractFurnitureFactory provides the basis for concrete factories
 * Each implementation will provide methods to create each piece of furniture, depending
 * on the particular collection the implementation reflects (e.g., antique, modern,...whatever)
 */
public interface AbstractFurnitureFactory {
    public Chair createChair();
    public Table createTable();
    public Lamp createLamp();
}
