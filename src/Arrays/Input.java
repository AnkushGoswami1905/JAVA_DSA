package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
// Array of Primitives
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(Arrays.toString(arr));
  //  Outputting the array using for loop
        for(int num : arr){
            System.out.print(num +" ");
        }
  //  Inputting value of array using for loop
        Scanner in = new Scanner(System.in);

        System.out.print("\nLength of an Array:");
        int length = in.nextInt();

        int[] rno = new int[length];

        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < rno.length; i++){
            rno[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(rno));
// Array of object
        String[] str = new String[3];
        in.nextLine();
        System.out.println("Enter 3 strings:");
        for (int i = 0; i < str.length; i++){
            str[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(str));

        in.close();
    }
}
