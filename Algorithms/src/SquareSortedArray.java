import com.sun.istack.internal.NotNull;

public class SquareSortedArray {

    public static int[] SquareSortedArray(int[] arr)
    {
        boolean isSorted=false;
        int lastUnsorted=arr.length-1;

        int[]  resArr=new int[arr.length];



        for(int i=0;i<arr.length;i++)
        {

            resArr[i] = arr[i] * arr[i];


        }
        while(!isSorted) {
            isSorted=true;
            for (int j = 0; j < lastUnsorted; j++) {
                if (resArr[j] > resArr[j + 1]) {

                    swap(resArr,j,j+1);
                    isSorted = false;
                }

            }
            lastUnsorted--;
        }
        return resArr;
    }

    private static int[] swap(int[] resArr, int j, int i) {
        int temp=0;
        temp = resArr[j];
        resArr[j] = resArr[j + 1];
        resArr[j+1]=temp;
        return resArr;
    }


    public static void main(String args[])
    {
        int[] arr =new int[]{-4,-1,0,3,10};
       int[] resArr= SquareSortedArray(arr);
       for(int i=0;i<resArr.length;i++)
       {
           System.out.println(resArr[i]);
       }

    }
}
