package Math;

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number:");
     int x = sc.nextInt();
     int n =x;
     int rev = 0;
     while(x>0){
     int digit = x%10;
     x = x/10;
     rev = rev*10+digit;
     }
     if(n==rev){
          System.out.println("Yes");
     }else{
          System.out.println("No");
     }
   }
}

//logic reverse the number and check it is same or not
/*
 n=123
 rev = 0;
 rev = rev*10+3 = 3
 rev = rev*10+2 = 32
 rev = rev*10+1 = 321
 */