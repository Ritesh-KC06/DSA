package IntroToProblemSolving.functions;
import java.util.*;

public class FunctionMain {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

        int C = Ffunction.sum (A, B);
        System.out.println("Sum of " + A + " & " + B + " = " + C);
    }
}
