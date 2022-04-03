import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodCost = scanner.nextInt() * days;
        int flightCost = scanner.nextInt() * 2;
        int hotelCost = scanner.nextInt() * (days - 1);
        System.out.println(foodCost + flightCost + hotelCost);
    }
}