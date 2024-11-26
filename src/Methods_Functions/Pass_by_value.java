package Methods_Functions;

public class Pass_by_value {
    public static void main(String[] args){
        String Name = "Ankush";
        changename(Name);
        System.out.println(Name);
    }

    static void changename(String naam) {
        naam = "suraj";// Here we are creating a new object and in pass by value method it would not change
                       // the original object
    }

}
