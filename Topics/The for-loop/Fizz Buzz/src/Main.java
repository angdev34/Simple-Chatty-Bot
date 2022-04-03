import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (; num1 <= num2; num1++) {
            if (num1 % 3 == 0 && num1 % 5  == 0) {
                System.out.println("FizzBuzz");
            } else if (num1 % 3 == 0) {
                System.out.println("Fizz");
            } else if (num1 % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num1);
            }
        }
    }
}
