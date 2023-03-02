/**
 * A class that is actually a car vroom vroom
 */
public class Car
{
    // global variables
    private double _milesPerGallon;
    private double _fuelTankCapacity;
    private double _fuelInTank;
    private double _odometer;

    /**
     * Constructor for a used car
     * @param milesPerGallon is the mpg of the car
     * @param fuelTankCapacity is the fuel tank capacity
     * @param odometer is the total miles the car has driven in its life
     */
    public Car(double milesPerGallon, double fuelTankCapacity, double odometer)
    {
        _milesPerGallon = milesPerGallon;
        _fuelTankCapacity = fuelTankCapacity;
        _odometer = odometer;
    }

    /**
     * Constructor for a new car
     * @param milesPerGallon is the miles per gallon of the vehicle
     * @param fuelTankCapacity is the fuel tank capacity of the car
     */
    public Car(double milesPerGallon, double fuelTankCapacity)
    {
        _milesPerGallon = milesPerGallon;
        _fuelTankCapacity = fuelTankCapacity;
        _fuelInTank = _fuelTankCapacity;
        _odometer = 0;
    }

    /**
     *
     * @return
     */
    public double getMilesPerGallon()
    {
        return _milesPerGallon;
    }

    public double getFuelTankCapacity()
    {
        return _fuelTankCapacity;
    }

    public double getFuelInTank()
    {
        return _fuelInTank;
    }

    public double getOdometer()
    {
        return _odometer;
    }

    public void addGas(double gallons)
    {
        if (gallons < _fuelTankCapacity - _fuelInTank)
        {
            _fuelInTank += gallons;
        }
        else
        {
            System.out.println();
            System.out.printf("Too much fuel. Pumped stopped at %.2f gallons.", (_fuelTankCapacity - _fuelInTank));
            _fuelInTank = _fuelTankCapacity;
        }
    }

    public void fillUp()
    {
        _fuelInTank = _fuelTankCapacity;
    }

    public boolean drive(double miles)
    {
        boolean canDrive = false;
        double maxDistance = _fuelInTank * _milesPerGallon;
        if (miles < maxDistance)
        {
            canDrive = true;
            _odometer += miles;
            _fuelInTank -= miles / _milesPerGallon;
        }
        else
        {
            System.out.println();
            System.out.println("You can't drive that far.");
        }
        return canDrive;
    }



    public String toString()
    {
        return System.out.printf("Fuel in tank: %.2f gallons...Odometer: %.2f miles.",
                _fuelInTank, _odometer).toString();
    }

    public static void main(String[] args)
    {
        Car silverado = new Car(11.2, 22.1, 227000.7);
        silverado.toString();
        System.out.println();

        Car civic = new Car(28.2, 13.1);
        civic.toString();
        civic.drive(300);
        System.out.println();
        civic.toString();
        civic.addGas(4);
        System.out.println();
        civic.toString();
        civic.drive(150);
        System.out.println();
        civic.toString();
        civic.addGas(50);
    }
}