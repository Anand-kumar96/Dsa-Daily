package Bit_Magic;

public class BitwiseLeftShift {
     public static void main(String[] args) {
        int x = 15;
        System.out.println(x<<2);  
     }
}
/*
 Formulla:
 // for small value
 x<<n = x*(2power(n))
 Ex: x= 3, n=1
 3*2^1=6
 Ex:x =3, n=3
 3*2^3 = 24
 Ex:x=15, n=2
 15*2^2 = 60
 */
/*
x=3
 Explanation: 32 bit
     x  : 0 0 0 0 0 0 ----- 0 0 1 1 ->+ve
  x<<2  : 0 0 0 0 0 0 ----- 1 1 0 0 ->+ve
 x<<28  : 0 0 1 1 0 0 ----- 0 0 0 0 ->+ve
 x<<30  : 1 1 0 0 0 0 ----- 0 0 0 0 ->-ve

 ex: x =-1 means 2^32-x =>2^32-1 i.e. all 1
     x :  1 1 1 1 1 1 1 1 1 1 1 1---------1 1 1 
  x<<1 :  1 1 1 1 1 1 1 1 1 1 1 1---------1 1 0 
   x*2^n = -1*2=-2
   becoz => 2^32-2 = -2
 */