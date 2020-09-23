//Finds the number of candles with the maximum height.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCandles {

    public static int BirthdayCandles(List<Integer> candles)
    {
        Collections.sort(candles);
        int count=0;
        int largest=candles.get(candles.size()-1);//getting the largest candle in the list
        for(int i = candles.size()-1; i >= 0; i--){
            if(largest == candles.get(i)){
                count++;
            }else{
                break;
            }
        }
        return count;
    }





    public static void main(String args[])
    {




       List<Integer> candles=new ArrayList();
        candles.add(4);

        candles.add(3);
        candles.add(1);
        candles.add(4);
        candles.add(2);




       int count= BirthdayCandles(candles);
       System.out.println(count);
    }
}
