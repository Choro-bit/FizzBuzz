package lab1;

public class Multiples {
    public static void main(String[] args) {
        int a = 1 ;
        int DivisibleNumbers = 0 ;
        while (a<1000) {
            boolean multipleOf3 = a % 3 == 0;
            boolean multipleOf5 = a % 5 == 0;
            if (multipleOf3 || multipleOf5) {
                DivisibleNumbers++;
            }
            a++;
        }
        System.out.println(DivisibleNumbers);
    }

}
