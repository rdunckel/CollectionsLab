package lab.activity2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Startup class for activity #2 of the Collections lab, demos functionality of
 * a basic List, this time using Generics and the For-Each loop.
 *
 * @author Ryan Dunckel <ryan.dunckel@my.wctc.edu>
 * @version 1.0
 * @see Employee
 */
public class Startup {

    /**
     * Main method runs the program to demo the functionality of a List.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        //Create some employees
        Employee employee1 = new Employee("John", "Smith", new GregorianCalendar(2010, 1, 15));
        Employee employee2 = new Employee("Jane", "Johnson", new GregorianCalendar(2009, 6, 28));
        Employee employee3 = new Employee("Joe", "Miller", new GregorianCalendar(2008, 3, 6));

        //Create list (use LSP), use Generics
        List<Employee> employees = new ArrayList<Employee>();

        //Add items to list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        //Loop over array using old, need cast without Generics
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getFirstName() + " was hired on "
                    + String.format("%ta %<tb %<td, %<tY", employee.getHireDate()));
        }

    }
}
