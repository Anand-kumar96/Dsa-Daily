package Math;

import java.util.Scanner;

public class Gcd {
     public static int findGcd(int a,int b){
          if(a==0){
               return b;
          }
          return findGcd(b%a, a);
     }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     //native solution
     /*
     int min = Math.min(a,b);
     while(min>0){
          if(a%min==0 && b%min==0){
               System.out.println(min);
               break;
          }
          min--;
     }
     */

     //Euclidean algorithm basic version
     /* 
     while(a!=b){
     if(a>b){
          a -=b;
     }else{
          b -=a;
     }
     }
     System.out.println(a);
     */
    
     //Recursive solution => Euclidean advance version
     System.out.println(findGcd(a,b));
     sc.close();
    } 
}

/*
01 native solution : Tc=> O(min(a,b)) Ts=>O(1)
02 Euclidean algorithm basic version=>
a = 20, b=15 => according to algo if a==b return a or b
and if a>b => a = a-b;
    if(b>a)=> b=b-a 
    repeat till a==b

03 advance version by using division
recursive solution : Tc=> O(n) Ts=>O(1)
 */