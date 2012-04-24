package lab.activity3;

/**
 * Represents a "typical" dog as a pet.
 *
 * @author Ryan Dunckel <ryan.dunckel@my.wctc.edu>
 * @version 1.0
 */
public class Dog {

    private String name;
    private String breed;

    /**
     * Convenience constructor.
     *
     * @param name The dog's name.
     * @param breed The dog's breed.
     */
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    /**
     * Standard accessor.
     *
     * @return The dog's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Standard mutator.
     *
     * @param firstName The dog's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standard accessor.
     *
     * @return The dog's breed.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Standard mutator.
     *
     * @param breed The dog's breed.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
