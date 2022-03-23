import java.util.Scanner;

public class Task2 {
    static Scanner  sc=new Scanner(System.in);
    public static void multiply() {
        System.out.print("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2=sc.nextInt();
        int multiply=num1*num2;
        System.out.println("Result is: "+multiply);

    }
}
