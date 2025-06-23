import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
      long a;
      Scanner input = new Scanner(System.in);
      a = input.nextLong();
      if(a%2 == 0)
          System.out.print("Even number");
      else
          System.out.print("Odd Number");
    }
}