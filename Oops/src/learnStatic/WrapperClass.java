package learnStatic;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;

        Integer a = 5;
        Integer b = 10;

//        a = 10;
        a = b;
        System.out.println(a);
        swap(a, b);

        System.out.println(a + " " + b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}


// OOPS TOPICS
//- basics - why oops
//- how to make classes
//- static, final, super keyword
//- wrapper classes - Integer, Character, Decimal, float
//- access modifiers - default ( same package ) , public ( everywhere ), private ( within class ), protected ( within class + children )
//- concepts - inheritance, abstraction, encapsualtion, polyporphism ( compile time / run time )