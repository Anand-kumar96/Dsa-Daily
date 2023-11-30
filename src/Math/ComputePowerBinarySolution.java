package Math;

import java.util.Scanner;

public class ComputePowerBinarySolution {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int n = sc.nextInt();
          int res = 1;
        while(n>0){
          if(n%2==1){
          //bit 1 logic
          res = res*x;
          }
          //else{
          // //bit 0 logic
          // //nothing
          // }
          x=x*x;
          n=n/2;
        }
        System.out.println(res);
      }
}

/*
 logic=> point 1) Every number can be written as sum of power of
 2(set bits in binary representation)
 2) we can traverse through all bits of a number (from LSB to
 MSB) in O(logn) time.

 example1=> 3^10 = 3^8 * 3^2  => 10:  1    0    1   0
                                    3^8  3^4  3^2 3^1
 example2=> 3^19 = 3^16 * 3^2 * 3^1  => 19:   1     0    0    1     1
                                            3^16   3^8  3^4  3^2   3^1
 res = 1
 while(n>0){
     if(n%2!=0){
          //bits 1 logic
     }
     else{
        //bits 0 logic  
     }
     n=n/2;
     x=x*x
 }
                                    

 */