public class doWhileLoops{
    public static void main(String[] args){

    //  1. print 1 to 10
       // int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while (i<=10);

        // 2. print 10 t0 1
//        int i=10;
//        do{
//            System.out.println(i);
//            i--;
//        }
//        while(i>=1);

       // 3. using break and continue statements

        // i. print 1 to 10 but stop at 7 using break statement

//        for (int i=1;i<=10;i++){
//            if(i==7){
//                break;
//            }
//            System.out.println(i);
//        }

        // 2. skip 5 using continue statement
//
//        for (int i=1;i<=10;i++){
//            if (i==5){
//                continue;
//            }
//            System.out.println(i);
//        }

        // 3.Print 1 to 20, excluding multiples of 3 using continue.

//        for (int i=1;i<=20;i++){
//            if(i%3==0){
//                continue;
//            }
//            System.out.println(i);
//        }

        int i=2;
        while(i<=20){
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
            i+=2;
        }

    }
}