package Methods_Functions;

public class Method_Parameter {
    public static void main(String[] args) {
        String personalized = mygreet("Ankush Goswami.");
        System.out.println(personalized);
    }

     static String mygreet(String name) {
        String message = "Hey "+name;
        return message;
    }
}
