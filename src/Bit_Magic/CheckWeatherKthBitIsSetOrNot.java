package Bit_Magic;

import java.util.Scanner;

public class CheckWeatherKthBitIsSetOrNot {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int k = sc.nextInt();
          // means from right side if kth bit is 1 return true else false
          /*
           //Method 1 => using left shift
            if ((n & (1 <<(k-1))) != 0){
               System.out.println("YES");
          }else{
               System.out.println("NO");
          }
           */
          //Method 2 => using right shift
          if ((n >>(k-1) &1) != 0){
               System.out.println("YES");
          }else{
               System.out.println("NO");
          }
     }
}

/*
 solution: using left shift operator
 we are doing kth bit set by using => 1<<(k-1)
 now doing bitwise and if value is 0 means not set
 Ex:
 n= 5, k=3
     1: 0 0 0 0 0 ---- 0 0 0 1

     5: 0 0 0 0 0 ---- 0 1 0 1
  1<<2: 0 0 0 0 0 ---- 0 1 0 0
5&1<<2: 0 0 0 0 0 ---- 0 1 0 0 => !=0 so Yes it is set


// 2nd method 
do n right shift by k-1 and then using and operator with 1
 n= 5, k=3
     5: 0 0 0 0 0 ---- 0 1 0 1
  5>>2: 0 0 0 0 0 ---- 0 0 0 1
     1: 0 0 0 0 0 ---- 0 0 0 1
5>>2&1: 0 0 0 0 0 ---- 0 0 0 1 => !=0 so Set
basically we are checking first bit by doing this

 */