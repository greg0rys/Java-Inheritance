public class Cat
{
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating a fresh fish..");
    }

    public void sleep() {
        System.out.println(name + " is sleeping..");
    }

    public void meow() {
        System.out.println(name + " says meow.");
    }

    public void setAge(int newAge)
    {
        System.out.println("Updating " + name + "'s age to: " + newAge);
        age = newAge;
    }

    public int getAge() { return age; }

    public boolean setName(String newName)
    {
        if(newName.isEmpty()) return false;
        name = newName;
        return true;
    }

    public String getName() { return name; }


    @Override
    public String toString()
    {
        return "Cat { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='meow'" +
                " }";
    }

}






