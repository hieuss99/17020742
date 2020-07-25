package task1;

public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
        // return;
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
        for (int i = 2; i <= N; i++) {
        check[i] = true;
    }
 
    // Thuật toán sàng nguyên tố
    // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i <= N; i++) {
        if (check[i] == true) {
        for (int j = 2 * i; j <= N; j += i) {
          check[j] = false;
        }
      }
    }
    // In ra các số là số nguyên tố
    for (int i = 2; i <= N; i++) {
      if (check[i] == true) {
        System.out.print(i + " ");
      }
    }

    }
}