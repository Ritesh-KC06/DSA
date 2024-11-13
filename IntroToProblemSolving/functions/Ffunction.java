package IntroToProblemSolving.functions;

public class Ffunction {
    
    public static int sum (int A, int B) {
        
        int C = A + B;
        return C;
        
    }

    public static int multiply (int A, int B) {

        int C = A * B;
        return C;
    }

    public static int square (int A) {
        int B = A * A;
        return B;
    }

    public static int cube (int A) {
        int B = A * A * A;
        return B;
    }

    public static int quotient (int A, int B) {
        int C = A/B;
        return C;
    }

    public static double temperature (double celcius) {
        double F = ((celcius * 9) / 5) + 32;
        double ans = Math.round(F * 100) / 100d;
        return ans;
    }

    public static int GoCorona (int A, int B, int C) {
        int day = 0;
        while (C > 0) {
            C = C + B;
            C = C - A;
            day++;
        }
        return day;
    }
}
