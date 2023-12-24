package Bit_Magic;

public class BitwiseNotOperator {
    public static void main(String[] args) {
     int x = 20  ;
     System.out.println(~x);;
    } 
}
//BITWISE NOT operator
/*
 so formulaa
if x is positive
~x => -(x+1) -> negative
if x is negative=>
~x = x-1 -> positive
 */
/*
 Integer range in java =>
 2^-31 to 2^31 -1
 java positive number simply store by doing decimal to binary
 ex: 7=>000000000------00111
 while java negative number store in 2's compliment form
  x => 00000000000 -----01 =>positive
 ~x => 11111111111 -----10 => negative
 */
/*
 2's complement representation=>
 representation of -x = 2^32 - x ;
 but 2^32 -1 = all 1
 now example
 Ex: x = 20;
 after complement
 we can write => 2^32-1-20 => 2^32-21
 means -21 Ans.
 Ex:x=-21
~x => 2^32-x = 21-1
    =>2^32-1-x= 20 ans.
 */
 /*
  first bit from left will be reserved for sign 
  (0 represent positive whereas 1 represent negative) and 
  other 3 bits will be used to store the values. 
  Similarly in 8-bit system, first bit from left will be used 
  for sign and remaining 7 will be used for values.
  */