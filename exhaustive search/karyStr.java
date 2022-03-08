
import java.util.Scanner;
import java.util.Arrays;
 
public class karyStr {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int n = sc.nextInt();
      char[] arrK = new char[k];
      for (int i = 0; i < k; i++) {
         arrK[i] = sc.next().charAt(0);
      }
      Arrays.sort(arrK);
      KAryString objKAryStr = new KAryString(n, arrK, k);
      objKAryStr.generateKAryString();
   }
}
 
class KAryString {
   protected char[] result;
   protected char[] arrK;
   protected int k;
 
   public KAryString(int length, char[] arrK, int k) {
      result = new char[length];
      this.k = k;
      this.arrK = arrK;
   }
 
   protected void generateKAryStringRek(int curIndex) {
      if (curIndex == -1) {
         process();
      } else {
         int a = arrK.length - 1;
         for (int i = 0; i < k; i++) {
            result[curIndex] = arrK[a];
            a--;
            generateKAryStringRek(curIndex - 1);
         }
      }
   }
 
   protected void process() {
      for (int i = result.length - 1; i >= 0; i--) {
         System.out.print(result[i]);
      }
      System.out.println();
   }
 
   public void generateKAryString() {
      generateKAryStringRek(result.length - 1);
   }
}