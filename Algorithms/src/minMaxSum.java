//minMax problem from Hackerrank.

public class minMaxSum {


   public static void  minMaxSum(int[] arr)
    {
        sort(arr);
        Long minsum=0L;
        Long maxsum=0L;

        for(int i=0;i<arr.length-1;i++)
        {
            minsum+=arr[i];
        }
        for(int i=1;i<arr.length;i++)
        {
            maxsum+=arr[i];
        }
        System.out.println(minsum+" "+maxsum);

    }
    private static int[] swap(int[] resArr, int j, int i) {
        int temp=0;
        temp = resArr[j];
        resArr[j] = resArr[j + 1];
        resArr[j+1]=temp;
        return resArr;
    }
private static int[] sort(int[] arr)
{
    boolean isSorted=false;
    int lastUnsorted=arr.length-1;

    int[] resArr=new int[arr.length];

    while(!isSorted)
    {
        isSorted=true;
        for(int j=0;j<lastUnsorted;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr,j,j+1);
                isSorted = false;
            }

        }
        lastUnsorted--;
    }
    return arr;

}

    public static void main(String args[])
    {
        int[] arr=new int[]{10,2,3,4,1};
        minMaxSum(arr);
    }
}
