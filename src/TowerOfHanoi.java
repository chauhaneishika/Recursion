public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B','C');
    }

    public static void hanoi(int n, char a,char b, char c) {
        if(n == 0) return;
        // n-1 disks from A to B via C
        hanoi(n-1,a,c,b);
        // largest from A to C
        System.out.println(a+"->"+c);
        // n-1 disks from B to C via A
        hanoi(n-1,b,a,c);

    }
}

//concept: n disks from A to C via B
//1. n-1 disks from A to B via C
//2. Largest disk from A to C
//3. n-1 disks from B to C via A
