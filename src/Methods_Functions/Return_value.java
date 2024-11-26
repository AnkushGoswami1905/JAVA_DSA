package Methods_Functions;

import java.util.Scanner;

public class Return_value {
    public static void main(String[] args) {
    int ans = sum2();
        System.out.println(ans);

    }
    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter Num one:");
        num1 = in.nextInt();
        System.out.print("Enter Num two:");
        num2 = in.nextInt();
        sum = num1 + num2;
        in.close();
        return sum;
    }
}
