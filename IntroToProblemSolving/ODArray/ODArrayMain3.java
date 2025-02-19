package IntroToProblemSolving.ODArray;

import java.util.*;

public class ODArrayMain3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Size of the Array- ");
        int size = scn.nextInt();

        int [] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = scn.nextInt();
        }

        System.out.print("Integer B- ");
        int B = scn.nextInt();

        //Q9 ->
        int [] C = ODArrayFunction.FirstLastIndexArray(arr, B);
        System.out.println("OutPut Array C- ");
        for (int i=0; i<C.length; i++){
            System.out.print(C[i] + ", ");
        }
        System.out.println("");

        //Q10 ->
        long [] arrD = ODArrayFunction.CubeArray(arr);
        System.out.println("Cube output array D- ");
        for (int i=0; i<arrD.length; i++){
            if(i != (arrD.length-1)){
            System.out.print(arrD[i] + ", ");
            } else {
                System.out.print(arrD[i]);
            }
        }
        System.out.println("");

        //Q11 ->
        int FirstMultipleX = ODArrayFunction.FirstMultiple(arr, B);
        System.out.println("First Multiple of Integer B- " + FirstMultipleX);

        //Q12 ->
        boolean ConsDuplicate = ODArrayFunction.FindDuplicate(arr);
        System.out.println("Consecutive Duplicate integers are present in Array- " + ConsDuplicate);

        //Q13 ->
        int [] FrqCntArray = ODArrayFunction.FrequencyCountArray(arr);
        System.out.println("Frequency Count Array- ");
        ODArrayFunction.PrintArray(FrqCntArray);
        System.out.println("");

        //Q14 -> Uniq Element of Array(without duplicate)
        int uniqD = ODArrayFunction.UniqIntegerWODuplicate(arr);
        System.out.println("Uniq Integer without Duplicate- " + uniqD);

        //Q15 - Sorted array (increasing)
        boolean SortedArray = ODArrayFunction.SortedArrayIncreasing(arr);
        System.out.println("Array is Sorted in Increasing Order- " + SortedArray);

        //Q16 -> 
        int PairCountofSumB = ODArrayFunction.CountPairofSumB(arr, B);
        System.out.println("Count of pairs in Array having sum B- " + PairCountofSumB);



    }
}
