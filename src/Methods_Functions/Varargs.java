package Methods_Functions;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        varargs(1,2,3,4,5,6,7,8,9,10);
        multiple(11,12,"A","B","C","D");
    }
    static void varargs(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(Arrays.toString(v));
    }
}
