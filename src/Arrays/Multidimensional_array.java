package Arrays;

import java.util.Arrays;

public class Multidimensional_array {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[][] array2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for (int row=0; row < array2D.length; row++){
            for (int col=0; col < array2D[row].length; col++){
                System.out.print(array2D[row][col] + " ");
            }
        System.out.println();
        }
    }
}
