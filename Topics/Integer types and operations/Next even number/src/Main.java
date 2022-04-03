import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num =  num + 2 - (num % 2);
        System.out.println(num);
    }
}