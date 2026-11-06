import java.util.Scanner;

public class Factorial{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to find factorial: ");
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(n+" factorial is : "+fact);
    }
}