import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int n = scanner.nextInt();
        int numberDivisible = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % n == 0) {
                numberDivisible++;
            }
        }
        System.out.println(numberDivisible);
    }
}