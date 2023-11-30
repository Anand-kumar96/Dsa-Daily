package Math;

import java.util.Scanner;

public class Factorial {
     public static long findFactorial(int n){
          if(n==0){
               return 1;
          }
         return n*findFactorial(n-1);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          //iterative
     // long ans = 1;
     // for(int i=1;i<=x;i++){
     //      ans =ans*i;
     // }
     // System.out.println(ans);
     
     // recursive
     long ans = findFactorial(x);
     System.out.println(ans);
     sc.close();
}
}

//iterative: tc=>O(n) ts:O(1)
//recursive: tc=>O(n) ts:O(n)