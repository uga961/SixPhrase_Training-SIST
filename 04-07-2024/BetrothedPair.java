import java.util.Scanner;

public class BetrothedPair {
    public static void main(String[] args)
    {
    long num1,num2,fact,sum1=0,sum2=0;
    Scanner input = new Scanner(System.in);
    num1 = input.nextLong();
    num2 = input.nextLong();
        for(fact=1;fact<=num1/2;fact++)
         {
            if(num1%fact==0)
                sum1+=fact;
         }
        for(fact=1;fact<=num2/2;fact++)
        {
            if(num2%fact==0)
                sum2+=fact;
        }
        if(sum1==num2+1 && sum2==num1+1)
            System.out.println("Betrothed Pair");
        else
                System.out.println("Not");
}
}
