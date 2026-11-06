import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){
        // 1. print 1 to 10.
//        for(int i=1;i<=10;i++){
//            System.out.print(i+" ");
//        }
        // 2. print Even numbers from 1 to 20.
//        for(int i=2;i<=20;i++){
//            if(i%2==0)
//            {
//                System.out.print(i+" ");
//            }
//        }
        // 3. odd num from 1 to 20
//        for (int i = 1; i <=20 ; i++) {
//            if ( i % 2!= 0){
//                System.out.println(i+" ");
//            }
//        }
        // 4. 50 to 1 Reverse
//        for (int i=50;i>=1;i--)
//        {
//            System.out.print(i+" ");
//        }
        // 5. Table

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res;
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}