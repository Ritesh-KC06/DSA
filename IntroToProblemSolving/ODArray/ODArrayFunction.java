package IntroToProblemSolving.ODArray;

public class ODArrayFunction {
    
    public static int Sum (int arr[]){
        int Sum = 0;
        for (int i = 0; i < arr.length; i++){
            Sum = Sum + arr[i];
        }
        return Sum;
    }

    public static double Avg (int arr[], int Sum){
        double length = arr.length;
        double Avg = Sum / length;
        return Avg;
    }

    public static int Max (int arr []) {
        int high = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > high) {
                high = arr[i];
            }
        }
        return high;
    }

    public static int Min (int arr []){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int product (int arr []){
        int product = 1;
        for (int i = 0; i < arr.length; i++){
            product = product * arr[i];
        }
        return product;
    }

    public static void ReverseArray (int arr[]){
        int size = arr.length;
        System.out.println("Print of reverse array");
        for (int i = size-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void PrintNegative (int arr[]){
        System.out.println("Negative integers of array = ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int [] NewArrayB (int arr [], int B){
        int [] NAB = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            NAB[i] = arr[i] + B;
        }
        return NAB;
    }
}
