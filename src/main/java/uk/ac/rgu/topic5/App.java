package uk.ac.rgu.topic5;

public class App {
    
    public static void main(String[] args){

        App instance = new App();
        instance.run();

        LogFormat verboseLogger = (String msg) -> {
            System.out.println("Verbose: " + msg);
        };
        verboseLogger.log("Hello world");

        LogFormat verboseLogger2 = new VerboseLogger();
        verboseLogger2.log("Hello world");

        LogFormat verboseLogger3 = (String msg) -> System.out.println("Verbose logger3: " + msg);

        LogFormat verboseLogger4 = instance::printWithEqualsSigns;

        verboseLogger4.log("hello world");



        Operation add = (x, y) -> {
            return x + y;
        };

        Operation add2 = (x, y) -> x + y;

       int result = add.perform(1, 2);
       System.out.println(result);

       result = add2.perform(1, 2);
       System.out.println(result);


        String[] myArray = {"Peter Parker", "Carol Danvers", "Steve Rogers", "Wanda Maximoff"};

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }

        for(String name : myArray){
            System.out.println(name);
        }




        var myString = "Hello world";
        int myInt = 3;

        GenericsClass<App> c = new GenericsClass<>(instance);
        c.printType();

        var obj = new Object();



        
    }

    /**
     * Instance method, to illustrate how method references work inside the same
     * object
     */
    public void run(){
        Operation mult = this::multiply;
        int result = mult.perform(3, 4);
        System.out.println(result);
    }

    /**
     * Multiplies the given numbers together
     * Used to illustrate the use of method references
     * @param num1
     * @param num2
     * @return
     */
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    /**
     * A method that can be used to implement the LogFormat functional interface
     * @param input
     */
    public void printWithEqualsSigns(String input){
        System.out.println("===" + input + "===");
        System.out.println("+++" + input);
        System.out.println("---" + input);
    }

    

}
