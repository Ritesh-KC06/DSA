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

        int SM = ODArrayFunction.Sum(arr);
        double avg = ODArrayFunction.Avg(arr, SM);

        System.out.println("Average of the array is = " + avg);
    }
}
