package uk.ac.rgu.topic7;

public class Person {
    private String firstname;
    private String surname;
    private int age;

    public Person(String fn, String sn, int age){
        this.firstname = fn;
        this.surname = sn;
        this.age = age;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.firstname + " " + this.surname + " " + this.age;
    }

}
