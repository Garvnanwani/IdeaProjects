package basics;

// packages are like folders consists of files that contain classes, package name and folder name is same

// one file can only contain one public class which should be names after the file name
// convention - packages name alsways lowercase, classes start with capital, functions and vars are in camel case, interface also start in Capital

// Access Modify ->
// public means ki you can use that classes betweeen different packages
// default is ki you can access that class only within that package
// private means ki you can access that var or func only inside that class
// protected means ki you can access that var or func only within that class and its children

// final, static, abstract, interface, super, this(), run time polymorphism, compile time polymorphism

// final is like const you cant change
// static means ki you can access that class property without making an object of it, static is mostly used when you want to keep some variable same between objects
// inside static methods you can only use static vars and methods
// this() is used to call the constructor of a class
// also this is used to refer the class object while referring to vars and methods of that class
// compiler time polymorphism - jab tum within class same function ko redclare ya method overloading karte ho
// abstract classes are used to make a class parent only like it cant be used on its own, it has to be extended by a different class to use it, so it acts as a blueprint ( abstract classes have abstract methods that need to be defined in the child class itself )
// its not neccasary to make a class abstract, in order to extend it but abstracting makes the parent class unusable by itself
// interfaces act like same as abstract classes but the thing is everything in interface is public and abstract by default
// har class ke parent Object class ko extend karti hain
// run time polymorphism - is when you dont know which method will be called, it can be calculated on run time, when you override a method in a child class
// interface and abstract diff - in abstract you can make both non abstract and abstract method but in interface everything is public and abstract
// second thing is that you can implement multiple interfaces for a single class but you cant extend multiple classes/ abstract classes in a single class
// you cant give **multiple parent** classes to a single child class
// ( java does not support multiple inheritance )

// super is used to call the constructor of parent, it is used inside child constructors

public class Basics {

    public class Dog {

    }

}

// class String
// public class String
