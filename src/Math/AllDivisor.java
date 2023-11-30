package Math;

import java.util.Scanner;

public class AllDivisor {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          //naive solution
          /*
          for(int i=1;i<=n;i++){
           if(n%i==0){
               System.out.println(i);
               }
          }
           */
          //efficient solution
          for(int i=1;i<=Math.sqrt(n);i++){
               if(n%i==0){
                    System.out.println(i);
               }
          }
          for(int i=(int)Math.sqrt(n);i>0;i--){
               if(n%i==0 && (i*i!=n)){
                    System.out.println(n/i);
               }
          }
      }
}

/*
 naive solution =>Tc:O(n)
 efficient solution =>Tc:O(sqrt(n))

 */