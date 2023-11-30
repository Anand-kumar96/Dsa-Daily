package Math;

import java.util.Scanner;

public class Lcm {
     public static int findGcd(int a,int b){
          if(b==0){
               return a;
          }
          return findGcd(b, a%b);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          //native
          /*
          int max = Math.max(a, b);
          while (true) {
          if(max%a==0 && max%b==0){
               System.out.println(max);
               return;
          }else{
               max++;
          }
          }
           */
          //efficient
          int gcd = findGcd(a,b);
          System.out.println((a*b)/gcd);
          sc.close();
     }
}

//native =>Tc=>O(a*b-max(a,b))