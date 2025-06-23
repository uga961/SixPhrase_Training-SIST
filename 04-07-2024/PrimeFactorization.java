import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        long num, fact;
        Scanner input = new Scanner(System.in);
        num = input.nextLong();///num=100
        for (fact = 2; num != 1; fact++)///fact=6
        {
            while (num % fact == 0)///if(1%5==0)
            {
                System.out.print(fact + " ");//2 2 5 5
                num = num / fact;///num=1
            }
        }
    }
}
