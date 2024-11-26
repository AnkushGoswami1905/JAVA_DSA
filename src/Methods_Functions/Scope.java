package Methods_Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            int c = 30;
            //int a = 1; Variable 'a' is already defined in the scope\\
            a = 11; // Reassigned local variable

            System.out.println("A:"+a);
            System.out.println("B:"+b);
            System.out.println("#C:"+c);
        }
        int c = 40;
        System.out.print("C:"+c);
    }
}
