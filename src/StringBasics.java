import java.util.ArrayList;

public class StringBasics {
    public static void main(String[] args) {
        String s = "Angel";
        change(s);
        System.out.println(s);

        String[] arr = {"Santosh", "Krish", "Hemant", "Preet"};

        ArrayList<String> al = new ArrayList<>();
        al.add("Shravani");
        al.add("Umang");
        al.add("Ayan");
        al.add("Shelly");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al){
        al.add("Biplab");
    }

    private static void change(String s) {
        s = "Angelina";
    } 
}
