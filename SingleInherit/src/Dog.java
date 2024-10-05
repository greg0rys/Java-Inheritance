public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating a fresh ham bone..");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void bark() {
        System.out.println(name + " says woof.");
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




