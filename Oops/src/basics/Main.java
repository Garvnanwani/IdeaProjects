package basics;


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
//        Student s3 = new Student(3, "Garv", 80);
//
//        Student s2 = s1;
//
//        s1.name = "Nazreen";
//        s1.rollNo = 22;
//        s2.rollNo = 26;
//
//        System.out.println(s3.name);
//        System.out.println(s3.rollNo);
//
//        printSomething();

        ScienceStudent ss1 = new ScienceStudent();
        System.out.println(ss1.name);
        System.out.println(ss1.rollNo);

        ss1.write();
    }

    static void printSomething() {
        System.out.println("kuchbhi");
    }
}

class Student {
    int rollNo;
    String name;
    int marks;

    // compile time polymorphism
    // Overloading
    Student() {
        rollNo = 0;
        name = "Nazreen";
        marks = 100;
    }

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void write() {
        System.out.println(this.name + " is writing");
    }
}

class ScienceStudent extends Student {

    // child class does not inherit constructor of parent, it simply copies the constructor for itself

    ScienceStudent() {
        super();
        this.name = "Garv";
    }

    // overriding, run time polymorphism
    @Override
    void write() {
        System.out.println(this.name + " student of science is writing");
    }


}

//static functions ke andar directly non static fucntions call ni kar sakte
// data 5 number store

//    int[] nums = new int[5];

// 5 students data
// student roll no
// student name
// student marks

//    int[] rollNos = new int[5];
//    String[] names = new String[5];
//    int[] marks = new int[5];

//    [[1,"Mukesh", 55], []]

// what is oop
// oop is ised to make your own data types

