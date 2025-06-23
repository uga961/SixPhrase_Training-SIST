import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args) {
        long num,fact,sum=0;
        Scanner input = new Scanner(System.in);
        num = input.nextLong();
        for(fact=1; fact<=num/2; fact++)
        {
            if(num%fact==0)
                sum=sum+fact;
        }
        if(sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not");
    }
}
