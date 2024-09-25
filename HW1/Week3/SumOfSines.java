import java.util.Scanner;
public class SumOfSines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = scanner.nextInt();
        double radians = Math.toRadians(degrees);
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}