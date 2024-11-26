package Methods_Functions;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num) {
        num[0] = 99; // Here we are modifying the object not creating a new object and modifying is allowed in pass
                     // by value method creating a new object would not change the original object
    }
}
