package IntroToProblemSolving.ODArray;

import java.util.*;

public class ODArrayMain4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input Array Size- ");
        int N = scn.nextInt();
        System.out.println("");

        int [] arr = new int[N];
        System.out.println("Please give inputs for array- ");
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        
        //Q17 ->
        System.out.print("Value to be inserted- ");
        int Y = scn.nextInt();
        System.out.println("");

        System.out.print("Position where Y has to be inserted- ");
        int X = scn.nextInt();
        System.out.println();

        int [] Narr = ODArrayFunction.insertNArray(arr, Y, X);

        ODArrayFunction.PrintArray(Narr);

        //Q18 ->
        System.out.print("Position which has to be deleted- ");
        int Z = scn.nextInt();

        int [] Sarr = ODArrayFunction.removeSArray(arr, Z);
        ODArrayFunction.PrintArray(Sarr);
        

        //Q19 ->
        int [] iarr = ODArrayFunction.IndexArray(arr);
        System.out.println("Inverse Index Array- ");
        ODArrayFunction.PrintArray(iarr);
        

        //Q20 ->
        int [] LFarr = ODArrayFunction.LastFirstArray(arr);
        System.out.println("Updated Array with Last integer at First- ");
        ODArrayFunction.PrintArray(LFarr);
        

        //Q21 ->
        int [] ADDiffarr = ODArrayFunction.AdjDiffArray(arr);
        System.out.println("Adjucent difference Array- ");
        ODArrayFunction.PrintArray(ADDiffarr);
    }
}
