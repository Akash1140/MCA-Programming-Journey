import java.sql.SQLOutput;
import java.util.Scanner;
public class Demo
{
    public static void main (String[] args)
    {
        // 1. Area of Rectangle
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the length of Rectangle: ");
//        int length=sc.nextInt();
//        System.out.print("Enter the breadth of Rectangle: ");
//        int breadth = sc.nextInt();
//        int area=length*breadth;
//        System.out.println("Area of Rectangle is: "+area);


//        // 2.  AVG of 3 numbers

//        Scanner sc =new Scanner(System.in);
//        System.out.print("enter num 1: ");
//        float num1=sc.nextFloat();
//        System.out.print("Enter num 2: ");
//        float num2=sc.nextFloat();
//        System.out.print("Enter num 3: ");
//        float num3= sc.nextFloat();
//        float Avg=(num1+num2+num3)/3;
//        System.out.println("Avg of 3 Numbers is: "+Avg);

        // 3. Swap of 2 num using another Var
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter 2 numbers ");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int temp=num1;
//        num1=num2;
//        num2=temp;
//        System.out.println("After Swapping num1 = "+num1+" And num2 = "+num2);


        // 4. Simple Interest

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter p,t,r values");
//        double P= sc.nextDouble();
//        double R=sc.nextDouble();
//        double T=sc.nextDouble();
//        double Si=P*T*R/100.0;
//        System.out.println(Si);

    //    5. Temperature Calc

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter cel val to convert into farenheit");
//        int cel=sc.nextInt();
//        int f=(cel*9/5)+32;
//        System.out.println("cel to fer is: "+f);


        // conditional statements if else type
        //

        // 6. positive or Negative

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter Any positive or Negative or zero number: ");
//        int num=sc.nextInt();
//        if(num>0){
//            System.out.println("Number is positive");
//        }
//        else if(num==0)
//        {
//            System.out.println("Number is Zero ");
//        }
//        else{
//            System.out.println("Number is negative");
//        }


        // 7. Even or Odd

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the Number: ");
//        int Num= sc.nextInt();
//        if (Num%2==0)
//        {
//            System.out.println("Number is Even");
//        }
//        else System.out.println("Number is Odd");


        //  8. Greater of 2 Numbers

//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter any 2 Numbers: ");
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        if (num1>num2){
//            System.out.println("Num1 is Greater");
//        } else if (num1==num2) {
//            System.out.println("Num1 and Num2 both Are Equal");
//        }
//        else {
//            System.out.println("Num2 is Greater");
//        }

        // 9. Voting Eligibility

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the Age : ");
//        int Age =sc.nextInt();
//        if (Age >=18 ){
//            System.out.println("Eligible to Vote");
//        }
//        else System.out.println("Not Eligible to vote");

        // 10. Student Result

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the Marks: ");
//        int marks=sc.nextInt();
//        if (marks>=35){
//            System.out.println("PASS");
//        }
//        else System.out.println("FAIL");


        // 11. Largest of 3 Numbers

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Any 3 Numbers: ");
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        if (a>=b && a>=c){
//            System.out.println("a is largest");
//        } else if (b>=a &&  b>=c) {
//            System.out.println("b is Largest");
//        }
//        else System.out.println("C is Largest");

        // 12. Find Leap Year

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year=sc.nextInt();
        if(year %400==0){
            System.out.println("Leap year");
        } else if (year%100==0) {
            System.out.println("Not a Leap Year");
        } else if (year%4==0) {
            System.out.println("Leap_Year");
        }
        else System.out.println("Not a Leap_Year");


        // 13. Valid Marks

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the marks: ");
//        int marks = sc.nextInt();
//        if (marks<0 || marks>100)
//        {
//            System.out.println("Invalid Marks");
//        } else if (marks>=75) {
//            System.out.println("Distinction");
//        }
//        else if (marks>=35){
//            System.out.println("Pass");
//        }
//        else System.out.println("Fail");
    }
}