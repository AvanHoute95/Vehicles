public class Person
{
    private String _name;

    /**
     * Creates a new person with a name
     * @param name of person
     */
    public Person(String name)
    {
        _name = name;
    }

    public String getName()
    {
        return _name;
    }

    public boolean equals(Object other)
    {
        boolean same = false;
        Person otherPerson;

        if(other instanceof Person)
        {
            otherPerson = (Person) other;
            if(otherPerson != null && _name.equals(otherPerson.getName()))
            {
                same = true;
            }
        }

        return same;
    }

    public String toString()
    {
        return getName();
    }

    public static void main(String[] args) {
        Person joe = new Person("Joe");
        Person otherJoe = new Person("Joe");
        Person jim = new Person("Jim");

        System.out.println(joe == otherJoe);  // Identity, are they in the same place
        System.out.println(joe.equals(otherJoe));  // Equality, are they the same thing
    }
}