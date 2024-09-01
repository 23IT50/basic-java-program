//Write a Program in Java to Add two Numbers.
import java.util.Scanner;
public class addnum{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num1=input.nextInt();
    System.out.print("Enter the number: ");
    int num2=input.nextInt();
    int add=num1+num2;
    System.out.println("The addition of two number is " + add);

    }
}