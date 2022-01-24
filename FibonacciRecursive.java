class FibonacciRecursive {
    private static long[] fibArray;
    public static void main(String[] args) {
        int x = 50;

        fibArray = new long[x + 1];

        for (int i = 0; i < x; i++) {
        fibArray[i] = fibonacci(i);
        }
    
        System.out.println(fibArray[x]);
    }

    static long fibonacci(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (fibArray[n] != 0){
            return fibArray[n];
        }
        
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}