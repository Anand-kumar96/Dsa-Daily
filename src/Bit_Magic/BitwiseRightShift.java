package Bit_Magic;

public class BitwiseRightShift {
     public static void main(String[] args) {
        int x = 2;
        int y =3;
        System.out.println(x>>1);  
        System.out.println(y>>2);  
     }
}
/*
//For Positive Number
  x = 33
   x : 0 0 0 0 0 ----- 0 1 0 0 0 0 1
x>>1 : 0 0 0 0 0 ----- 0 0 1 0 0 0 0 => means 1 will be removed and 0 added to left
 Ans: 16

//For Negayive Number
// a) Signed Right Shift => in this case removed from right and fill left with 1
Ex: x =-2
     x : 1 1 1 1 1 1 1 ------- 1 1 0
  x>>1 : 1 1 1 1 1 1 1 ------- 1 1 1 => Ans =>-1
  x>>2 : 1 1 1 1 1 1 1 ------- 1 1 1 => Ans =>-1
  x>>4 : 1 1 1 1 1 1 1 ------- 1 1 1 => Ans =>-1
  always -1 after that

  //b)UnSigned Right Shift => in this case removed from right and fill left with 0
 Ex: x =-2
     x : 1 1 1 1 1 1 1 ------- 1 1 0
  x>>1 : 0 1 1 1 1 1 1 ------- 1 1 1 => Ans =>2147483647
  always -1 after that
  */