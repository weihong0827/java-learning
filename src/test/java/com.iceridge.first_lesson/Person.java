package test.java.com.iceridge.first_lesson;
import test.java.com.iceridge.second_lesson.Name;

public class Person {
    private Name PersonName;
    private static int PersonCounter=0;    //static variable is a global variable that doesnt belong to just the instance

    public  Person (Name PersonName){
        this.PersonName = PersonName;
        /*
        'this' is used to refer to the private Name variable that is created above
         while the PersonName is the Name variable that is pass in to the constructor
         Constructors are like the init method in python oop
         it runs when the object is initiated

         */
    }
    public Person(){
        /*
        This is a default constructor with no inputs
        */
        PersonCounter++;
    }
    public String helloWorld() {
        return "Hello World";
    }
    public String hello(String name){
        return "Hello "+name;
    }

    public Name GetName(){
        Name personName = PersonName;
        return personName;
    }

    public static int NumPerson() {
        return PersonCounter;
        //since the PersonCounter is static, you should make the method static too
        //This makes it become a class method
    }
}
