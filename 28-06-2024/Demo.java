import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        num1  = input.nextInt();
        num2 = input.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 is" +num1);
        System.out.println("num2 is" +num2);
    }
}
