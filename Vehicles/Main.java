import java.beans.VetoableChangeListener;
import java.util.ArrayList;

public class Main
{


    public static boolean inAny(ArrayList<Vehicle> rides, Person person)
    {
        boolean found = false;

        for(Vehicle ride : rides)
        {
            if (ride.hasPerson(person))
            {
                found = true;
            }
        }

        return found;
    }


    public static double averageWeight(ArrayList<Vehicle> rides)
    {
        double total = 0.0;
        for (Vehicle ride : rides)
        {
            total += ride.getWeight();
        }

        return total / rides.size();
    }


    public static void main(String[] args)
    {
        Person austin = new Person("Austin");
        Person joe = new Person("Joe");
        Person hollyanne = new Person("Hollyanne");
        Car myRide = new Car(3000);
        Bike otherRide = new Bike(20);

//        Vehicle[] rides = {myRide, otherRide};
        ArrayList<Vehicle> rides = new ArrayList<>();
        rides.add(otherRide);
        rides.add(myRide);

        myRide.setDriver(austin);
        myRide.setPassenger(hollyanne);
        otherRide.setDriver(joe);

        System.out.println(averageWeight(rides));
        System.out.println(inAny(rides, hollyanne));

        for (Vehicle ride : rides)
        {
            System.out.println(ride);
        }
    }

}
