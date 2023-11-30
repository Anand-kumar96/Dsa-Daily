package Math;

import java.util.Scanner;

public class PrimeFactors {
     public static boolean checkIfPrime(int n) {
          if (n == 2 || n == 3)
               return true;
          if (n % 2 == 0 || n % 3 == 0)
               return false;
          for (int i = 5; i < n; i += 6) {
               if (n % i == 0 || n % (i + 2) == 0)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          // Naive solution
          /*
           * for(int i=2;i<n;i++){
           * if(checkIfPrime(i)){
           * int x = i;
           * while (n%x==0) {
           * System.out.println(i);
           * x *=i;
           * }
           * }
           * }
           */
          // efficient solution
          /*
           * if (n <= 1) return;
           * for (int i = 2; i <= Math.sqrt(n); i++) {
           * while (n % i == 0) {
           * System.out.println(i);
           * n = n / i;
           * }
           * }
           * if (n > 1) {
           * System.out.println(n);
           * }
           */
          // more efficient solution => just like prime number to reduce 2 and 3
          if (n <= 1)
               return;
          // for 2
          while (n % 2 == 0) {
               System.out.println(2);
               n = n / 2;
          }
          // for 3
          while (n % 3 == 0) {
               System.out.println(3);
               n = n / 3;
          }
          for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
               while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
               }
               while (n % (i + 2) == 0) {
                    System.out.println(i + 2);
                    n = n / (i + 2);
               }
          }
          if (n > 3) {
               System.out.println(n);
          }
          // now
          sc.close();
     }
}

/*
 * Naive solution=> Tc:O(nsqr logn) Ts:O(1)
 */
