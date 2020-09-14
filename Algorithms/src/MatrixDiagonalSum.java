import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
/**MatrixDiagonalSumDiff finds the diff in the sum of the matrix elements diagonally**/
public class MatrixDiagonalSum {

    public static int MatrixDiagonalSumDiff(List<List<Integer>> arr) {
        int leftdiagonal=0;
        int rightdiagonal=0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }

      return Math.abs(leftdiagonal - rightdiagonal);
        }





  public static void main(String args[]) {
        List<List<Integer>> mainobj=new ArrayList<>();
        List<Integer> obj=new ArrayList<>() ;

        obj.add(4);
        obj.add(0);
        obj.add(0);
        obj.add(0);
        mainobj.add(obj);
        List<Integer> obj1=new ArrayList<>() ;
        obj1.add(-1);
        obj1.add(1);
        obj1.add(-7);
        obj1.add(-8);
        mainobj.add(obj1);
        List<Integer> obj2=new ArrayList<>() ;
        obj2.add(-10);
        obj2.add(-8);
        obj2.add(-5);
        obj2.add(-2);
        mainobj.add(obj2);
        List<Integer> obj3=new ArrayList<>() ;
        obj3.add(0);
        obj3.add(9);
        obj3.add(7);
        obj3.add(-1);
        mainobj.add(obj3);
        List<Integer> obj4=new ArrayList<>() ;
        obj4.add(4);
        obj4.add(4);
        obj4.add(-2);
        obj4.add(1);
        mainobj.add(obj4);










      int diff=  MatrixDiagonalSumDiff(mainobj);
      System.out.println(diff);

    }



}

