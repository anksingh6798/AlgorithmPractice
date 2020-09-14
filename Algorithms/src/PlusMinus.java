import java.math.BigDecimal;
//Method PlusMinus() counts the number of positive,negative or 0 entries in an array,divides with the total length of array and converts the result upto 6 decimal places.
public class PlusMinus {

    public static void PlusMinus(int[] arr)
    {
        int lessthanzero=0;
        int morethanzero=0;
        int zero=0;


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                lessthanzero++;

            }
            else if(arr[i]>0)
            {
                morethanzero++;
            }
            else
            {
                zero++;
            }
        }


        System.out.println(BigDecimal.valueOf(((double)lessthanzero)/arr.length).setScale(6));//code to convert the result to 6 decimal places.
        System.out.println(BigDecimal.valueOf(((double)morethanzero)/arr.length).setScale(6));
        System.out.println( BigDecimal.valueOf(((double)zero)/arr.length).setScale(6));
    }

    public static void main(String args[])
    {
        int[] arr=new int[]{1,1,0,-1,-1};
        PlusMinus(arr);
    }
}
