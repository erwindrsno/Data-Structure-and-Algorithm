import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BitString objBitString = new BitString(n);
        objBitString.generateBitString();
    }
}
 
class BitString {
    protected int[] result;
 
    public BitString(int n) {
        result = new int[n];
    }
 
    protected void generateBitStringRek(int curIndex) {
        if (curIndex == -1) {
            process();
        } else {
            result[curIndex] = 0;
            generateBitStringRek(curIndex - 1);
            result[curIndex] = 1;
            generateBitStringRek(curIndex - 1);
        }
    }
 
    protected void process() {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
 
    public void generateBitString() {
        generateBitStringRek(result.length - 1);
    }
}