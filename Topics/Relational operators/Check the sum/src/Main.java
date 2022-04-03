import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int checkNum = 20;
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1 + num2 == checkNum || num1 + num3 == checkNum || num2 + num3 == checkNum);
    }
}