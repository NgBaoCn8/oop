import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double dist = Math.sqrt(x * x + y * y);
        System.out.println(dist);
    }
}