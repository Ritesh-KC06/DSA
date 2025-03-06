package IntroToProblemSolving.TDArray;

import java.util.*;

import IntroToProblemSolving.ODArray.ODArrayFunction;

public class TDArrayMain1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Row size of Matrix- ");
        int N = scn.nextInt();
        System.out.print("Column size of Matrix- ");
        int M = scn.nextInt();

        int [][] mat = new int [N][M];

        System.out.println("Please give input for Matrix- ");
        for (int i=0; i < N; i++){
            for (int j=0; j < M; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        //Q1 ->
        System.out.println("Matrix Display- ");
        TDArrayFunction.Print2DArray(mat);

        //Q2 ->
        System.out.println("Column Matrix Display- ");
        TDArrayFunction.Print2DArrayColumnWise(mat);

        //Q3 ->
        System.out.println("Column Wave Matrix Display- ");
        TDArrayFunction.Print2DWaveArrayColunmWise(mat);

        //Q4 ->
        System.out.println("Row Wave Matrix Display- ");
        TDArrayFunction.Print2DWaveArrayRowWise(mat);

        //Q5 ->
        int [] Sum2DArray = TDArrayFunction.TDArraySum(mat);
        System.out.println("Output Sum Array- ");
        ODArrayFunction.PrintArray(Sum2DArray);

        //Q6 ->
        int [][] Sum2Mat = TDArrayFunction.TMatrixSum(mat, mat);
        System.out.println("Sum of two Matrix- ");
        TDArrayFunction.Print2DArray(Sum2Mat);

        //Q7 ->
        int [] Max2DArrayRow = TDArrayFunction.FindMax2DArrayRow(mat);
        System.out.println("Output 1D Array with max in a row of Matrix- ");
        ODArrayFunction.PrintArray(Max2DArrayRow);

        //Q8 ->
        boolean EqualMat = TDArrayFunction.EqualMatrix(mat, Sum2Mat);
        System.out.println("Given two matrices are equal- " + EqualMat);

        //Q9 ->
        int [][] SubMat = TDArrayFunction.SubtractionMatrix(mat, Sum2Mat);
        System.out.println("Subtraction Matrix- ");
        TDArrayFunction.Print2DArray(SubMat);
    }
    
}
