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
}
