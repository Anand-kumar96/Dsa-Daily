package Math;
public class CountDigit {
    public static void main(String[] args) {
          int x = 90988800;
          int count =0;
          while(x>0){
               x =x/10;
               count++;
          }
          System.out.println(count);
     }
}
