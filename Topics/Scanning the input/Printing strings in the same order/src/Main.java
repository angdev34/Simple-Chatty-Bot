import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArr = new ArrayList<>();

        while (scanner.hasNext()) {
            stringArr.add(scanner.next());

        }
        stringArr.forEach ( System.out::println );
    }
}
