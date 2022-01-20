package person;

public class Person {
    public static void main(String[] args) {
        Account acc = new Account();

        System.out.println(acc.name);
        System.out.println(acc.getBalance());
        System.out.println(acc.setBalance(10000000));
    }

}
