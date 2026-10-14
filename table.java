import java.util.Scanner;
class table{
public static void main(String[] args){
int num ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
num = sc.nextInt();
for(int i = 0;i<=10;i++){
System.out.println(num+"*"+i+"="+num*i);
       }

    }
}