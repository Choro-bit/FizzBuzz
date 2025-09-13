package lab1;

public class Multiples {

    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);  // same as before, but now flexible
        System.out.println(count);
    }

    // Generalized multiples method
    public static int multiples(int n, int a, int b) {
        int number = 1;
        int divisibleNumbers = 0;

        while (number < n) {
            boolean multipleOfA = number % a == 0;
            boolean multipleOfB = number % b == 0;

            if (multipleOfA || multipleOfB) {
                divisibleNumbers++;
            }

            number++;
        }

        return divisibleNumbers;
    }
}
