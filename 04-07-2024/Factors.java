import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        long num,fact;
        Scanner input = new Scanner(System.in);
        num = input.nextLong();///num=10
        for(fact=1; fact<=num/2; fact++)///fact=6<=5
        {
            if(num%fact==0)///if(10%5==0)
            {
                System.out.print(fact + " ");//1 2 5
            }
        }
        System.out.print(num);///10
    }
}
