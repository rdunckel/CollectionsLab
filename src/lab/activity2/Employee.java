package lab.activity2;

import java.util.Calendar;

/**
 * Represents a "typical" employee in corporate America.
 *
 * @author Ryan Dunckel <ryan.dunckel@my.wctc.edu>
 * @version 1.0
 */
public class Employee {

    private String firstName;
    private String lastName;
    private Calendar hireDate;

    /**
     * Convenience constructor.
     *
     * @param firstName The employee's first name.
     * @param lastName The employee's last name.
     * @param hireDate The employee's last name.
     */
    public Employee(String firstName, String lastName, Calendar hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
    }

    /**
     * Standard accessor.
     *
     * @return The employee's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Standard mutator.
     *
     * @param firstName The employee's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Standard accessor.
     *
     * @return The employee's hire date.
     */
    public Calendar getHireDate() {
        return hireDate;
    }

    /**
     * Standard mutator.
     *
     * @param hireDate The employee's hire date.
     */
    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Standard accessor.
     *
     * @return The employee's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Standard mutator.
     *
     * @param lastName The employee's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
