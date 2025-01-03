package IntroToProblemSolving.ODArray;
import java.util.*;

public class ODArrayMain1 {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        System.out.println("Length of the array =");
        int length = scn.nextInt();
        int [] arr = new int[length];

        for (int i = 0 ; i < length ; i++){
            System.out.println("Input at index " + i);
            arr[i] = scn.nextInt();
        }

        System.out.println("Print of array");
        for (int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }

        /* 
        //Q3 ->
        int SM = ODArrayFunction.Sum(arr);
        System.out.println("Sum of the array is = " + SM);

        double avg = ODArrayFunction.Avg(arr, SM);
        System.out.println("Average of the array is = " + avg);

        //Q2 ->
        int max = ODArrayFunction.Max(arr);
        System.out.println("Highest int of the array is = " + max);

        int min = ODArrayFunction.Min(arr);
        System.out.println("lowest int of the arra is = " + min);

        //Q4 ->
        int prod = ODArrayFunction.product(arr);
        System.out.println("Product of the integers of the array = " + prod);

        //Q1 ->
        ODArrayFunction.ReverseArray(arr);
        

        //Q5 ->
        ODArrayFunction.PrintNegative(arr);
        */
        
        //Q6 ->
        System.out.println("Please provide integer B for new Array =");
        int B = scn.nextInt();
        int [] ARB = ODArrayFunction.NewArrayB(arr, B);
        System.out.println("new Array = ");
        for (int i = 0; i < ARB.length; i++){
            System.out.println(ARB[i]);
        }
    }
}
