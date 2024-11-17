package IntroToProblemSolving.functions;
import java.util.*;

public class FunctionMain {
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
        
        //Q2 ->
        int D = Ffunction.multiply(A, B);
        System.out.println("Product of " + A + " & " + B + " = " + D);

        //Q3 ->
        int E = Ffunction.square(A);
        System.out.println("Square of " + A + " = " + E);

        //Q4 ->
        int F = Ffunction.cube(A);
        System.out.println("Cube of " + A + " = " + F);

        //Q5 ->
        int G = Ffunction.quotient(A, B);
        System.out.println("Quotient of " + A + " / " + B + " = " + G);

        //Q6 ->
        System.out.println("Temperature in Celcius");
        double celcius = scn.nextDouble();

        double Fahrenheit = Ffunction.temperature(celcius);
        System.out.println("Temperature in Fahrenheit is " + Fahrenheit);
        
        //Q7 ->
        System.out.println("Average cases recovered in a day");
        int H = scn.nextInt();
        System.out.println("Number of new cases");
        int I = scn.nextInt();
        System.out.println("Current active cases");
        int J = scn.nextInt();

        int K = Ffunction.GoCorona(H, I, J);
        System.out.println("minimum days to reach 0 cases = " + K);

    }
}
