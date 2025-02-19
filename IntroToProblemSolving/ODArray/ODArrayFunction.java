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

    public static boolean FindK (int arr [], int K){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == K){
                return true;
            }
        }
        return false;
    }

    public static int FrequencyK (int arr [], int K){
        int frequency = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == K){
                frequency++;
            }
        }
        return frequency;

    }

    public static void PrintOdd (int arr []) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void PrintEven (int arr []) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    @SuppressWarnings("unused")
    public static int [] FirstLastIndexArray (int arr [], int B) {
        int FirstIndex = arr[0];
        int LastIndex = arr[arr.length-1];
        int [] ans = new int[2];

        for(int i=0; i<arr.length; i++){
            if(arr[i] == B){
                FirstIndex = i;
                break;
            } 
        }
        System.out.println("FirstIndex- " + FirstIndex);

        for(int i=(arr.length-1); i>=0; i--){
            if(arr[i] == B){
                LastIndex = i;
                break;
            }    
        }
        
        System.out.println("LastIndex- " + LastIndex);

        ans[0] = FirstIndex;
        ans[1] = LastIndex;
        return ans;
    }

    public static long [] CubeArray (int arr []){
        long [] B = new long [arr.length];
        for (int i=0; i<arr.length; i++){
            B[i] = (long)arr[i]*arr[i]*arr[i];
        }
        return B;
    }

    public static int FirstMultiple (int arr [], int B) {
        int ans = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % B == 0){
                ans = arr[i];
                return ans;
            }
        }
        return ans;
    }

    public static boolean FindDuplicate (int arr []){
        for (int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }

    public static int [] FrequencyCountArray (int arr []){
        int [] ans = new int [arr.length];

        for (int i=0; i<arr.length; i++){
            ans[i] = ODArrayFunction.FrequencyK(arr, arr[i]);
        }
        return ans;

    }

    public static void PrintArray (int arr []){
        System.out.print("{ ");
        for (int i=0; i<arr.length; i++){
            if (i != (arr.length-1)){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print(" }");
        System.out.println("");
    }

    public static int UniqIntegerWODuplicate (int arr []){
        int ans = arr[0];
        for (int i=0; i<arr.length; i++){
            if (ODArrayFunction.FrequencyK(arr, arr[i]) == 1 ){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    public static boolean SortedArrayIncreasing (int arr []){
        boolean ans = true;

        for (int i=1; i<arr.length; i++){
            if (arr[i] >= arr[i-1]){
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static int CountPairofSumB (int arr [], int B){
        int ans = 0;
        for (int i=0; i<(arr.length-1); i++){
            for (int j=(i+1); j<arr.length; j++){
                if((arr[i] + arr[j]) == B){
                    ans ++;
                }
            }
        }
        return ans;
    }

    public static int [] insertNArray (int arr[], int A, int B){
        int [] ans = new int [(arr.length + 1)];
        for (int i=0; i<(B-1); i++){
            ans[i] = arr[i];
        }
        ans[B-1] = A;
        for (int i=B; i<ans.length; i++){
            ans[i] = arr[i-1];
        }
        return ans;
    }

    public static int [] removeSArray (int arr[], int A){
        int [] ans = new int [(arr.length - 1)];
        for (int i=0; i<(A-1); i++){
            ans[i] = arr[i];
        }
        for (int i=A-1; i<ans.length; i++){
            ans[i] = arr[i+1];
        }
        return ans;
    }

    public static int [] IndexArray (int arr []){
        int [] ans = new int [arr.length];

        for (int i=0; i<arr.length; i++){
            ans[arr[i]] = i;
        }

        return ans;
    }

    public static int [] LastFirstArray (int arr []){
        int [] ans = new int [arr.length];

        for (int i=0; i<(arr.length-1); i++){
            ans [i+1] = arr[i];
        }
        ans[0] = arr[(arr.length-1)];

        return ans;
    }

    public static int [] AdjDiffArray (int arr []){
        int [] ans = new int [arr.length - 1];

        for (int i=1; i<arr.length; i++){
            ans[i-1] = arr[i] - arr[i-1];
        }

        return ans;
    }

}
