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

        System.out.println("Integer B- ");
        int B = scn.nextInt();

        int [] C = ODArrayFunction.FirstLastIndexArray(arr, B);
        System.out.println("OutPut Array C- ");
        for (int i=0; i<C.length; i++){
            System.out.print(C[i] + ", ");
        }
    }
}
