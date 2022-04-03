import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();    
        int group3 = scanner.nextInt();
        group1 += group1 % 2;
        group2 += group2 % 2;
        group3 += group3 % 2;
        int deskNum = (group1 + group2 + group3) / 2;
        System.out.println(deskNum);
        
    }
}
