package uk.ac.rgu.topic6.abstractfactory;

public class App {
    
    public static void main(String[] args){

        System.out.println("== Building antique furniture collection ==");
        buildFurniture(new AntiqueFurnitureFactory());

        System.out.println(); //blank line
        System.out.println("== Building modern furniture collection ==");
        buildFurniture(new ModernFurnitureFactory());
    }

    static void buildFurniture(AbstractFurnitureFactory factory){
        Chair chair = factory.createChair();
        System.out.println(chair.getDescription());

        Table table = factory.createTable();
        System.out.println(table.getDescription());

        Lamp lamp = factory.createLamp();
        System.out.println(lamp.getDescription());
    }

}
