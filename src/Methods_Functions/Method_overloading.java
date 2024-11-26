package Methods_Functions;

import java.util.Arrays;

public class Method_overloading {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);
        fun("A","B","C","D","E","F","G","H","I","J");
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
}
// Using same methods name with for different operation \\