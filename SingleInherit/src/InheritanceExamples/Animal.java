package InheritanceExamples;

public class Animal
{
    protected String name;
    protected int age;

    // having the bark and meow features in each of the animals seperate classes shows teh need
    // for inheritance

    public Animal(String animalName,int animalAge)
    {

        name = animalName;
        age = animalAge;

    }

    public void eat()
    {
        System.out.println(name + " is eating..");
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping..");
    }

    public void setAge(int newAge)
    {
        System.out.println("Updating " + name + "'s age to: " + newAge );
        age = newAge;
    }

    public int getAge() { return age; }

    public String getName() { return name; }
    public boolean setName(String newName)
    {
        if(newName.isEmpty()) return false;
        name = newName;
        return true;
    }


}