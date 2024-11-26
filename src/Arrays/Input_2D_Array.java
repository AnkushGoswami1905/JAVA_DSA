package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the number of rows and columns (M X N):");
        r = in.nextInt();
        c = in.nextInt();
        int[][] array_2D = new int[r][c];
        System.out.println("Length of Array " +array_2D.length);

        System.out.println("Enter "+r * c+" elements:");
        for (int row = 0; row < array_2D.length; row++) {
            for (int col = 0; col < array_2D[row].length; col++) {

                array_2D[row][col] = in.nextInt();

            }
        }
        System.out.println("The entered 2D array is:");
        for (int[] a: array_2D ){
            System.out.println(Arrays.toString(a));
        }
    }
}