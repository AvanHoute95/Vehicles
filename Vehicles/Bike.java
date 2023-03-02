/**
 * Bike
 */
public class Bike extends Vehicle
{
    public Bike(int weight)
    {
        super(weight);
    }

    public void makeSound()
    {
        System.out.println("Ding, ding");
    }

    public String toString()
    {
        return String.format("Bike (%d) with %s", getWeight(), getDriver());
    }

}
