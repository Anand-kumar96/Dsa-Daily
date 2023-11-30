package Math;

import java.util.Scanner;

public class TrailingZero {
//      public static long findFactorial(int n) {
//           if (n == 0) {
//                return 1;
//           }
//           return n * findFactorial(n - 1);
//      }

//      public static int trailingZero(long n){
//        int ans = 0;
//        while(n>0){
//           int digit = (int)n%10;
//            if(digit==0){
//                ans++;
//            }else{
//                return ans;
//            }
//            n = n/10;
//        }
//        return ans;
//      }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
     //native solution
          // long fact = findFactorial(x);
          // int ans = trailingZero(fact);
          // System.out.println(ans);

     // efficient solution
     /*
          int n=1;
          int ans = 0;
          int num =x;
          while(num>0){
                num = x/(int)Math.pow(5, n);
                ans +=num;
               if(num > 0){
                  n++;
               }
          }
      */

     // best solution
          int ans = 0;
          for(int i=5;i<=x;i=i*5){
               ans += x/i;
          }
          System.out.println(ans);
          sc.close();
     }
}

// native solution=> tc=>O(n) ts:O(1) => overflow issue
// efficient solution => tc=>O(n) ts:O(1)
// best solution => tc=>O(logn) ts:O(1)
/*
count prime factorization of 2 and 5
=> most important is number of 5 will be going to less than 2 
so better to count total number of 5 
 */
 