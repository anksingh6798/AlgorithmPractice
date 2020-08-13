//Given an array of Integers ,return how many of them contain an even number of digits.


public class EvenNumberDigits {

    public static int evenDigits(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          String num=String.valueOf(arr[i]);
          if((num.length())%2==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
     int[]   nums = new int[]{12,345,2,6,7896,890989,0,90};

      int count=  evenDigits(nums);
      System.out.println(count);

    }
}
