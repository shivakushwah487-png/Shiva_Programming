import java.util.Scanner;
public class SRK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the frist num");
      int m = sc.nextInt();
      System.out.println("enter the Second num");
       int n = sc.nextInt();

      System.out.println("Before swapping: m = " + m + ", n = " + n);

        m = m + n;  
        n = m - n;  
        m = m - n; 

        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}