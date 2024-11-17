package IntroToProblemSolving.functions;

import java.util.Scanner;

public class Q2Multiply {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        System.out.println("Input 1");
        int A = scn.nextInt();
        System.out.println("Input 2");
        int B = scn.nextInt();

        int D = Ffunction.multiply(A, B);
        System.out.println("Product of " + A + " & " + B + " = " + D);
    }
}
