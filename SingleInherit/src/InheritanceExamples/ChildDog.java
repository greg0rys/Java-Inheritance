package InheritanceExamples;


public class ChildDog extends Animal
{

    public ChildDog(String name, int age)
    {
        // call the Parent classes constructor to init fields.
        super(name,age);
    }

@Override
public void eat()
{
    System.out.println(name + " is eating a fresh ham bone..");
}

    @Override
    public String toString()
    {
        return "Dog { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='woof'" +
                " }";
    }


}