import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hourToSec = 3600;
        final int minToSec = 60;
        int totalSec1 = scanner.nextInt() * hourToSec + scanner.nextInt() * minToSec + scanner.nextInt();
        int totalSec2 = scanner.nextInt() * hourToSec + scanner.nextInt() * minToSec + scanner.nextInt();
        System.out.println(Math.abs(totalSec1 - totalSec2));
    }
}