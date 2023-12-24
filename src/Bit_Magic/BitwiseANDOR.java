package Bit_Magic;

import java.util.Scanner;

public class BitwiseANDOR {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          // Bitwise AND Operator
          int andOperator = a&b;
          System.out.println(andOperator);
          // Bitwise OR Operator
          int orOperator = a|b;
          System.out.println(orOperator);
          sc.close();
     }
}

/*
 a = 5=>  00000......101 ->32 bits
 b = 7=>  00000......111 
 And =>   00000000000101=>5
 Or  =>   00000000000111=>7
 */