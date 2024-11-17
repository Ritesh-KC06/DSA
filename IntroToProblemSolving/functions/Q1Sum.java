package IntroToProblemSolving.functions;

import java.util.Scanner;

public class Q1Sum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        
                System.out.println("Input 1");
                int A = scn.nextInt();
                System.out.println("Input 2");
                int B = scn.nextInt();
        
                //Q1 ->
                int C = Ffunction.sum (A, B);
                System.out.println("Sum of " + A + " & " + B + " = " + C);
    }
    
}
