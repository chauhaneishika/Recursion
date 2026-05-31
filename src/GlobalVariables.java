public class GlobalVariables {
    // public static void main(String[] args) {
    //     int x = 10;  local variable
    //     change(x);
    //     System.out.println(x);
    // }
    // public static void change(int x){
    //     x = 20;
    // }

    //Global variable
    static int x = 10;
    public static void main(String[] args) {
        fun();
        System.out.println(x);
    }
    public static void fun() {
        x = 20;
    }
}
