package lab.activity1;

import java.util.ArrayList;
import java.util.List;

/**
 * Startup class for activity #1 of the Collections lab, demos functionality of
 * a basic List.
 *
 * @author Ryan Dunckel <ryan.dunckel@my.wctc.edu>
 * @version 1.0
 */
public class Startup {

    /**
     * Main method runs the program to demo the functionality of a List.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        //Create list (use LSP), no Generics
        List colors = new ArrayList();

        //Add items to list
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        //Loop over array using old, need cast without Generics
        for (int i = 0; i < colors.size(); i++) {
            String color = (String) colors.get(i);
            System.out.println(color);
        }

    }
}
