import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] total = new int[4];
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            switch (str) {
                case  "A":
                    total[0] += 1;
                    break;
                case "B":
                    total[1] += 1;
                    break;
                case "C":
                    total[2] += 1;
                    break;
                case "D":
                    total[3] += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println(total[3] + " " + total[2] + " " + total[1] + " " + total[0]);
    }
}