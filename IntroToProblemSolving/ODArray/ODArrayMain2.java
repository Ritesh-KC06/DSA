package IntroToProblemSolving.ODArray;
import java.util.*;

public class ODArrayMain2 {
    public static void main(String[] args) {
         
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        
        System.out.println("No of Test Cases - ");
        int T = scn.nextInt();

        for (int t=1; t <= T; t++) {

            System.out.println("Test Case no = " + t);
            System.out.println("Size of the Array = ");
            int Size = scn.nextInt();

            int [] arr = new int[Size];

            for (int i = 0; i < Size; i++){
                arr[i] = scn.nextInt();
            }

            //Q7 ->
            System.out.print("Integer to be found in Array  ");
            int K = scn.nextInt();

            boolean ans = ODArrayFunction.FindK(arr, K);
            System.out.println("Presence of K in Array = " + ans);

            int freq = ODArrayFunction.FrequencyK(arr, K);
            System.out.println("Frequency of K in array = " + freq);

            //Q8 ->
            System.out.print("Even numbers in Array- ");
            ODArrayFunction.PrintEven(arr);
            System.out.println("");
            System.out.print("Odd numbers in Array- ");
            ODArrayFunction.PrintOdd(arr);
            System.out.println("");

        }
    }
}
