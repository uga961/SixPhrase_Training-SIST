import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	int num;
	Scanner input = new Scanner (System.in);
	  num = input.nextInt ();
	if (num != 0)
	  {
		if (num < 0)
		  System.out.print ("Negative");
		else
		  System.out.print ("Positive");
	  }
	else
	    System.out.print ("Zero");

  }
}
