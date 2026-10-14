import java.util.Scanner;

class evenOddloop {
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
            System.out.println("_________________________");
            System.out.println();
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a+" "+"this number is an even");
        }
        else {
            System.out.println(a + " " + "this number is an odd");
        }
        }
    }
}
