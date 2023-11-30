package Math;

import java.util.Scanner;

public class CheckPrime {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          //native approach
          /*
          for (int i = 2; i < n; i++) {
               if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
               }
          }
          System.out.println("Prime");
           */

          // efficient
          /*
          for (int i = 2; i <= n/2; i++) {
              if (n % i == 0) {
                   System.out.println("Not Prime");
                   return;
              }
         }
         System.out.println("Prime"); 
           */
          //most efficient
          int x=(int) Math.sqrt(n);
          for(int i=2;i<=x;i++){
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
               }
          }
           System.out.println("Prime");
     }
}
/*
 native =>Tc=>O(n) Ts=>O(1)
 efficient=>Tc=>O(n/2) Ts=>O(1)
 most efficient=>Tc=>O(sqrt(n)) Ts=>O(1)
 :LOGIC=> if(x,y) is a pair of n
         then x*y = n;
         and if(x<=y)
         then x*x <=x*y
             x*x <=n
             x<= sqrt(n)
             that's why we check till sqrt of n
 => 1 is neither prime nor composite number and 2 is only even prime number
 */