public class GCDofTwoNumbers {
    // public int gcd(int a, int b) {
    //     //a % b = a(if a < b) 
    //     if(a == 0) return b;
    //     return gcd(b % a, a);
    // }

    public static int gcd(int a, int b){
        return helper(Math.min(a, b),Math.max(a, b));
    }

    public static int helper(int a, int b) {
        if(a == 0) return b;
        return helper(b%a, a);
    }
}
