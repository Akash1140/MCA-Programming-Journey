import java.util.Scanner;

public class Pattern {
    static void main() {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter i j and k values: ");
//        int i= sc.nextInt();
//        int j= sc.nextInt();
//        int k= sc.nextInt();
//        for (int i=1;i<=5;i++){
//            for (int j=0;j=5;j++){
//                System.out.print("_");
//            }
//            for (int k=1;k<i;k++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//       }
        // pattern 4
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=3;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }


        // Pattern 5
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}