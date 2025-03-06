package IntroToProblemSolving.TDArray;

public class TDArrayFunction {
    
    public static void Print2DArray (int arr[][]){
        int N = arr.length;
        int M = arr[0].length;

        for(int i=0; i<N; i++){
            System.out.print("{ ");
            for(int j=0; j<M; j++){
                if(j != (M-1)){
                    System.out.print(arr[i][j] + ", ");
                } else{
                    System.out.print(arr[i][j] + " }");
                }
                
            }
            System.out.println("");
        }
        
    }

    public static void Print2DArrayColumnWise (int arr [][]){
        int N = arr.length;
        int M = arr[0].length;

        for(int j=0; j<M; j++){
            System.out.print("{ ");
            for(int i=0; i<N; i++){
                if(i != (N-1)){
                    System.out.print(arr[i][j] + ", ");
                } else{
                    System.out.print(arr[i][j] + " }");
                }
                
            }
            System.out.println("");
        }
    }

    public static void Print2DWaveArrayColunmWise (int arr [][]){
        int N = arr.length;
        int M = arr[0].length;

        for(int j=0; j<M; j++){
            System.out.print("{ ");
            if (j%2 == 0){
                for(int i=0; i<N; i++){
                    if(i != (N-1)){
                        System.out.print(arr[i][j] + ", ");
                    } else{
                        System.out.print(arr[i][j] + " }");
                    }
                }
            }else{
                for(int i=N-1; i>=0; i--){
                    if(i != 0){
                        System.out.print(arr[i][j] + ", ");
                    } else{
                        System.out.print(arr[i][j] + " }");
                    }
                }
            }
            System.out.println("");
            
        }
    }

    public static void Print2DWaveArrayRowWise (int arr [][]){
        int N = arr.length;
        int M = arr[0].length;

        for(int i=0; i<N; i++){
            System.out.print("{ ");
            if(i%2 == 0){
                for(int j=0; j<M; j++){
                    if(j != (M-1)){
                        System.out.print(arr[i][j] + ", ");
                    } else {
                        System.out.print(arr[i][j] + " }");
                    }
                }
                System.out.println("");
            } else {
                for(int j=M-1; j>=0; j--){
                    if(j != 0){
                        System.out.print(arr[i][j] + ", ");
                    } else {
                        System.out.print(arr[i][j] + " }");
                    }
                }
                System.out.println("");
            }
            
        }
    }

    public static int[] TDArraySum (int [][] arr){

        int N = arr.length;
        int M = arr[0].length;
        int [] ans = new int[N];

        for(int i=0; i<N; i++){
            int Sum = 0;
            for(int j=0; j<M; j++){
                Sum = Sum + arr[i][j];
            }
            ans[i] = Sum;
        }
        return ans;
    }

    public static int[][] TMatrixSum (int [][] mat1, int [][] mat2){
        int N = mat1.length;
        int M = mat1[0].length;
        int [][] ans = new int [N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int Sum = mat1[i][j] + mat2[i][j];
                ans [i][j] = Sum;
            }
        }
        return ans;
    }

    public static int[] FindMax2DArrayRow (int [][] arr){
        int N = arr.length;
        int M = arr[0].length;
        int [] ans = new int[N];

        for(int i=0; i<N; i++){
            int max = arr[i][0];
            for(int j=0; j<M; j++){
                if (arr[i][j] >= max){
                    max = arr[i][j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }

    public static boolean EqualMatrix (int [][] mat1, int [][] mat2){
        int N = mat1.length;
        int M = mat1[0].length;
        boolean ans = true;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(mat1[i][j] != mat2[i][j]){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

    public static int[][] SubtractionMatrix (int [][] mat1, int [][] mat2){
        int N = mat1.length;
        int M = mat1[0].length;
        int [][] ans = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ans[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return ans;
    }
}
