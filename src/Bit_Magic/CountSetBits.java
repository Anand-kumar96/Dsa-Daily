package Bit_Magic;

import java.util.Scanner;

public class CountSetBits {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int count=0;
          //Nieve Solution
          //method 01
           while(n>0){

          //    if((n &1)!=0){
          //     count++;
          //    }

          // above condition can be also
          count = count+(n &1);
          n =n>>1;
          }
           
          //method02
          /*
             while(n>0){
               if(n%2==1){
               count++;
               }
               n=n/2;
          }
           */
        
          System.out.println(count);
          sc.close();
        }
}

//Tc:O(Total bits in n)
/*
 Count set bits (1) in binary representation
 =>n>=0 given
 */