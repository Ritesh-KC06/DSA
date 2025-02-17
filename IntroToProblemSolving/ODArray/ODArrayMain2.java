package IntroToProblemSolving.ODArray;
import java.util.*;

public class ODArrayMain2 {
    public static void main(String[] args) {
         
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        System.out.println("Size of the Array = ");
        int Size = scn.nextInt();

        int [] arr = new int[Size];

        for (int i = 0; i < Size; i++){
            arr[i] = scn.nextInt();
        }

        System.out.print("Integer to be found in Array  ");
        int K = scn.nextInt();

        boolean ans = ODArrayFunction.FindK(arr, K);
        System.out.println("Presence of K in Array = " + ans);

        int freq = ODArrayFunction.FrequencyK(arr, K);
        System.out.println("Frequency of K in array = " + freq);
    }
}
