public class Staircase {

    public static void Staircase(int n ) {

        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i < n - j ? " " : "#");
            }
            System.out.println("");
        }

    }




    public static void main(String args[])
    {

        Staircase(4);
    }
}
