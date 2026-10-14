import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        while (true) {
            int a, b;
            System.out.println("enter two num");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            b = sc.nextInt();
            System.out.println();
            System.out.println("less than" + " " + (a < b));
            System.out.println("greater than" + " " + (a > b));
            System.out.println("less than or equal to" + " " + (a <= b));
            System.out.println("greater than or equal to" + " " + (a >= b));
            System.out.println("equal to" + " " + (a == b));
            System.out.println("NOT equal to" + " " + (a != b));
        }
    }

}