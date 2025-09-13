package lab1;

public class Multiples {

    public static void main(String[] args) {
        // call the no-argument version
        int count = multiples();
        System.out.println(count);

        // also possible to call the general version
        int count2 = multiples(20, 3, 5);
        System.out.println(count2);
    }

    // No-argument version → calls the general one with defaults
    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    // Generalized version
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
