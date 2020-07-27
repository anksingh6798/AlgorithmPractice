//Find maximum number of consecutive 1's in the Array.
//I will store all the diff counted values of 1's in an array and then try to find out the maximum value.

import java.util.*;

public class ConsecutiveOne {


    public  static int  Consecutiveones(int[] nums)
    {
        int count=0;
        HashSet Consecutivecount=new HashSet();
       // Object[] obj=new Object[]{};

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;

                if(i==nums.length-1)
                {
                    Consecutivecount.add(count);
                }
            }
            else
            {

                Consecutivecount.add(count);
                count=0;
            }
        }





return (int) Collections.max(Consecutivecount);
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,1,1,0,0,1,1,1,0,1,1,1,1,1};

    int longestCOunt= Consecutiveones(arr);
    System.out.println(longestCOunt);
    }
}
