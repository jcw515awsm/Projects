
public class RecursivePrintHi {
    public static void main(String[] args) {
        int n = 5;

        greet(n);
    }

    static void greet(int n) {
        if (n == 0) {
            return;
        }
        else {
        System.out.println("Hi!");
        greet(n - 1);
        }
    }
}
