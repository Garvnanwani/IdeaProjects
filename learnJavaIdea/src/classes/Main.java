package classes;
// class serves as a blueprint for creating objects

// objects are an instance of an class
// class should be an entity meaning one class should contain only things that are related to it, like a person class can have things like age, name but not things like weather

class Classname {
    // instance variable
    int val1;
    String val2;

    // methods
    void method1(/* parameters */) {
        // body of method1
    }

    int method2(/* parameters */) {
        // body of method2
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        // defining an object of a class
        // classname var = new classname()
        // assignment in java happens from right to left so first you create an object
        // of type Pokemon, java creates the object and creates space for it in memory
        // and assignes it to p1 of type Pokemon

        Pokemon p1 = new Pokemon();

        p1.name = "Pikachu";
        p1.level = 10;

        System.out.println(p1.name + " " + p1.level);

        // both objects are different and changing one doesnt affect other ( this is
        // also called encapsulation )
        // oops pillars - encapsulation, inheritance, polymorphism, abstraction

        Pokemon p2 = new Pokemon();

        p2.name = "Bulbasaur";
        p2.level = 10;

        p2.attack();

        Pokemon p3 = new Pokemon("Charizard", 3);

        System.out.println(p3.level);
        p3.attack();

    }
}
