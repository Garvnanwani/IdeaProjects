public class Recursion {
    // function that sums all digits of it
    // 3456 -> 3 + 4 + 5 + 6

    public static void main(String[] args) {
        int n = 3456;
        int res = digitMultiplyRecursion(n);

        System.out.println(res);
    }

    public static int digitMultiplyRecursion(int n) {
        if(n == 0) {
            return 1;
        }
        return n%10 * digitMultiplyRecursion(n/10);
    }

    public static int digitSumRecursion(int n, int count) {
        if(n == 0) {
            return 0;
        }
        count++;
        return n%10 + digitSumRecursion(n/10, count);
    }

//    to get the last digit you have to do %10, and to then remove the last digit you have to
    public static void digitSumLoop() {
        int res = 0;
        int n = 3456;

        while(n > 0){
            int remainder = n % 10;
            res = res + remainder;
            n = n/10;
        }

        System.out.println(res);
    }
}

