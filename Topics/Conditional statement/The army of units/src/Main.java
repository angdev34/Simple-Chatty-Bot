import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitNum = scanner.nextInt();
        if (unitNum < 1) {
            System.out.println("no army");
        } else if (unitNum <= 19) {
            System.out.println("pack");
        } else if (unitNum < 250) {
            System.out.println("throng");
        } else if (unitNum < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}