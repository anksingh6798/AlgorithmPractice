import java.util.Scanner;

public class Factorial {

  public static int fact(int n)
    {

            if (n == 0)
                return 1;
            else if (n == 1)
                return 1;
            else

                return n * fact(n - 1);


    }

    public static void main(String[] args)
    {
        int factsum=0;
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();


                factsum = fact(input);





      System.out.println(factsum);

    }
}
