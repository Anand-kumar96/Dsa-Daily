package Math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
     public static boolean checkPrimeNumber(int n) {
          if (n == 1)
               return false;
          if (n == 2 || n == 3)
               return true;
          if (n % 2 == 0 || n % 3 == 0)
               return false;
          for (int i = 5; i * i <= n; i = i + 6) {
               if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
               }
          }
          return true;

     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          // naive solution
          /*
           * for(int i=2;i<n;i++){
           * if(checkPrimeNumber(i)){
           * System.out.println(i);
           * }
           * }
           */
          // simple implementation of sieve
          /*
          boolean isprime[] = new boolean[n + 1];
          Arrays.fill(isprime, true);
          for (int i = 2; i <= Math.sqrt(n); i++) {
               if (isprime[i]) {
                    for (int j = 2 * i; j <= n; j = j + i) {
                         isprime[j] = false;
                    }
               }
          }
          for (int i = 2; i <= n; i++) {
               if (isprime[i]) {
                    System.out.println(i);
               }
          }
           */
     //optimized solution
     boolean isprime[] = new boolean[n + 1];
     Arrays.fill(isprime, true);
     for (int i = 2; i <= n; i++) {
          if (isprime[i]) {
               System.out.println(i);
               for (int j = i * i; j <= n; j = j + i) {
                    isprime[j] = false;
               }
          }
     }

     sc.close();
     }
}

/*
 naive solution =>Tc:O(sqrt(n)*n)
 optimized solution =>Tc:O(logn*logn)
 */