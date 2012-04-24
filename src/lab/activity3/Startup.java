package lab.activity3;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import lab.activity2.Employee;

/**
 * Startup class for activity #3 of the Collections lab, demos functionality of
 * a List containing different types of Objects.
 *
 * @author Ryan Dunckel <ryan.dunckel@my.wctc.edu>
 * @version 1.0
 * @see Employee
 * @see Dog
 */
public class Startup {

    /**
     * Main method runs the program to demo the functionality of a List.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        //Create some objects
        Employee employee1 = new Employee("John", "Smith", new GregorianCalendar(2010, 1, 15));
        Employee employee2 = new Employee("Jane", "Johnson", new GregorianCalendar(2009, 6, 28));
        Employee employee3 = new Employee("Joe", "Miller", new GregorianCalendar(2008, 3, 6));

        Dog dog1 = new Dog("Fido", "Labrador");
        Dog dog2 = new Dog("Spot", "Dalmation");

        //Create list (use LSP), no Generics
        List items = new ArrayList();

        //Add items to list
        items.add(employee1);
        items.add(employee2);
        items.add(employee3);
        items.add(dog1);
        items.add(dog2);

        //Loop over array using old, need cast without Generics
        for (Object object : items) {
            if (object instanceof Employee) {
                Employee employee = (Employee) object;
                System.out.println("Employee " + employee.getFirstName() + " was hired on "
                        + String.format("%ta %<tb %<td, %<tY", employee.getHireDate()));
            } else if (object instanceof Dog) {
                Dog dog = (Dog) object;
                System.out.println("Dog " + dog.getName() + "'s breed is "
                        + dog.getBreed());
            }
        }

    }
}
