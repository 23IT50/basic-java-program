import java.util.Scanner;
public class swap{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number1: ");
    int num1=input.nextInt();
    System.out.print("Enter the number2: ");
     int num2=input.nextInt();
    System.out.println("number 1 is:" + num1);
    System.out.println("number 2 is:" + num2);
    int swap = num1;
    num1 = num2;
    num2 = swap;
    System.out.println("number 1 is:" + num1);
    System.out.println("number 2 is:" + num2);
    }
}