import java.util.Scanner;
 
public class SumSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setSLength = sc.nextInt();
        int[] setS = new int[setSLength];
        for (int i = 0; i < setSLength; i++) {
            setS[i] = sc.nextInt();
        }
        int tLength = sc.nextInt();
        int[] setT = new int[tLength];
        for (int i = 0; i < setT.length; i++) {
            setT[i] = sc.nextInt();
        }
        BitString objBS = new BitString(setSLength, setS, setT);
        objBS.generateBitString();
    }
}
 
class BitString {
    protected int[] result;
    int[] setS;
    int[] setT;
    int[] resSetT;
 
    public BitString(int n, int[] setS, int[] setT) {
        this.setS = setS;
        this.setT = setT;
        result = new int[n];
        this.resSetT = new int[setT.length];
        for (int i = 0; i < resSetT.length; i++) {
            resSetT[i] = 0;
        }
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
 
    public void process() {
        for (int i = 0; i < setT.length; i++) {
            int total = 0;
            for (int j = 0; j < result.length; j++) {
                if (result[j] == 1) {
                    total += setS[j];
                }
            }
            if (total == setT[i]) {
                resSetT[i] += 1;
            }
        }
    }
 
    public void generateBitString() {
        generateBitStringRek(result.length - 1);
        for (int i = 0; i < resSetT.length; i++) {
            System.out.println(resSetT[i]);
        }
    }
}