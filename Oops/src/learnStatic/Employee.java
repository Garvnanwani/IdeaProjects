package learnStatic;

public class Employee {

    int age;
    String name;
    String dept;
    int salary;
    static int totalEmployee = 0;

    Employee() {
        totalEmployee++;
    }

    // koi aisa variable, function jo saare objects ke beech constant ho
    // aur jo tu bina object banaye access kar paaye

}
