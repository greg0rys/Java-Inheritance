import InheritanceExamples.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {

        System.out.println("***** WITHOUT INHERITANCE *****");
        Dog dog = new Dog("Fido", 7);
        Cat cat = new Cat("Fluffy", 2);

        System.out.println(dog);
        dog.setAge(15);
        dog.sleep();
        dog.eat();

        System.out.println();
        System.out.println(cat);
        cat.setAge(15);
        cat.sleep();
        cat.eat();


        System.out.println("\n***** WITH INHERITANCE *****");
        Animal cDog = new ChildDog("Fido", 8);
        Animal cCat = new ChildCat("Fluffers", 13);





        System.out.println();
        System.out.println(cDog);
        cDog.setAge(5); // method defined in Animal class
        cDog.sleep(); // method defined in Animal class
        cDog.eat(); // method defined in Animal class

        System.out.println();
        System.out.println(cCat);
        cCat.setAge(4); // method defined in Animal class
        cCat.sleep(); // method defined in Animal class
        cCat.eat(); // method defined in Animal class



    }
}

