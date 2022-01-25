class FibonacciRecursive {
    private static long[] fibArray;
    public static void main(String[] args) {
        int x = 70;

        fibArray = new long[x+1];
        
        fibArray[x] = fibonacci(x);

        System.out.println(fibonacci(x));
    }

    static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        } 
        if (fibArray[n] != 0){
            return fibArray[n];
        }
        long fibNum = fibonacci(n - 1) + fibonacci(n - 2);
        fibArray[n] = fibNum;

        return fibNum;
    }
}
