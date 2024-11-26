package Methods_Functions;

import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        greetings();
    }
    static void greetings() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String Name = in.nextLine();
        System.out.println("Hello "+Name+"!");
    }
}