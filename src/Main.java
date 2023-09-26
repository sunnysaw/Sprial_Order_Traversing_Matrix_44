/*

 */


import java.util.Scanner;

public class Main {
    static void Traversing_Matrix(int[][] array){
        int row = array.length;
        int column = array[0].length;
        int right = column - 1;
        int left = 0;
        int top = 0;
        int bottom = row - 1;
        int direction = 0;
        int index = 0;
        int[] Duplicate_Array = new int[row * column];

        while (top <= bottom && left <= right){
            for (int start = left; start <= right; start++){
                Duplicate_Array[index] = array[top][start];
                index++;
            }
            top++;
        }
        for (int i = 0; i < row * column; i++) {
            System.out.print(Duplicate_Array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of 2d array (ROW) :");
        int row = input.nextInt();
        System.out.println("Enter the length of 2d array (Column) :");
        int column = input.nextInt();
        int[][] Two_D_Array = new int[row][column];
        System.out.println("Now enter value inside 2d array :");
        for (int start = 0; start < row; start++){
            for (int second_start = 0; second_start < column; second_start++){
                Two_D_Array[start][second_start] = input.nextInt();
            }
        }
        System.out.println("Printing the result :");
        Traversing_Matrix(Two_D_Array);
    }
}