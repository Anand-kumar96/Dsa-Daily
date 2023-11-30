package Math;

import java.util.Scanner;

public class ComputePower {
     public static int power(int x, int n){
          if(n==0){
               return 1;
          }
          int temp = power(x, n/2);
          temp = temp*temp;
          if(n%2==0){
               return temp;
          }
          return temp*x;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int n = sc.nextInt();
          //naive solution
          /*
          long ans = 1;
          for(int i=0;i<n;i++){
               ans = ans*x;
          }
          System.out.println(ans);
           */
          //efficient solution
          System.out.println(power(x,n));
     }
     
}

/*
 Naive solution: Tc:O(n)
 efficient solution: Tc:O(logn) Ts:O(logn)
 approach:
 power(x,n) => if(n%2)==0
               power(x,n) = power(x,n/2)*power(x,n/2)
               else
               power(x,n-1)*x

    example:     pow(3,5)---------------->pow(3,2) ---------------->pow(3,1)------------------>pow(3,0)
          temp = 3*3, temp=3*3*3*3, odd    temp=3, temp =3*3 even   temp=>1 temp =1*1=1 odd        
               return 3*3*3*3*3              return 3*3              return 1*3 =3            return 1
 */