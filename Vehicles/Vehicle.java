/**
 * A vehicle
 */
public abstract class Vehicle {
    private Person _driver;
    private int _weight;

    /**
     *
     * @param weight
     */
    public Vehicle(int weight)
    {
        _weight = weight;
        _driver = null;
    }

    /**
     *
     * @return
     */
    public int getWeight()
    {
        return _weight;
    }

    /**
     *
     * @return
     */
    public Person getDriver()
    {
        return _driver;
    }

    public void setDriver(Person newDriver)
    {
        _driver = newDriver;
    }

    /**
     *
     * @param person
     * @return
     */
    public boolean hasPerson(Person person)
    {
       boolean contains = false;
       if (_driver != null && _driver.equals(person))
       {
           contains = true;
       }
       return contains;
    }

    /**
     *
     */
    public abstract void makeSound();

    public String toString()
    {
        return String.format("Vehicle (%d) with %s as driver", _weight, _driver);
    }

}
