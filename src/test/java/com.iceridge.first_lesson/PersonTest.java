package test.java.com.iceridge.first_lesson;

import test.java.com.iceridge.second_lesson.Name;
import org.junit.Test;
//junit is a testing frame work

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World",marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloName(){
        Person wh = new Person();
        assertEquals("Hello wh",wh.hello("wh"));
    }
//    @Test
//    public void shouldReturnName(){
//        Name new_name = new Name();
//        Person name = new Person(new_name);
//        assertEquals();
//    }
    @Test
    public void shouldReturnNumPerson(){
        Person p1 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p2 = new Person();
        assertEquals(4,Person.NumPerson());
    }

    @Test
    public void booleanDemo(){
        boolean monday = true;
        boolean raining = true;

        if (monday || raining){

        }
    }
}
