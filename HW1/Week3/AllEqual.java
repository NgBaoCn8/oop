import java.util.*;
public class AllEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println("all equal");
        }
        else {
            System.out.println("not all equal");
        }
    }
}