/**
 *
 */
public class Car extends Vehicle
{
    private Person _passenger;

    /**
     *
     * @param weight
     */
    public Car(int weight)
    {
        super(weight);
        _passenger = null;
    }

    /**
     *
     */
    public Person getPassenger()
    {
        return _passenger;
    }

    /**
     *
     * @param passenger
     */
    public void setPassenger(Person passenger)
    {
        _passenger = passenger;
    }

    public boolean hasPerson(Person person)
    {
        boolean isPassenger = false;
        if(_passenger != null && _passenger.equals(person))
        {
            isPassenger = true;
        }

        // if there is a passenger for a car given, return this one. If not, return vehicle driver
        return isPassenger || super.hasPerson(person);
    }

    /**
     * honk honk
     */
    public void makeSound()
    {
        System.out.println("Honk, honk");
    }

    public String toString()
    {
        return String.format("Car (%d) with %s and %s", getWeight(), getDriver(), getPassenger());
    }
}
