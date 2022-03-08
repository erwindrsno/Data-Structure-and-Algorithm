
import java.util.Scanner;
 
public class TesterKombinasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        Combination objKombinasi = new Combination(n, length);
        objKombinasi.generateKombinasi();
    }
}
 
class Combination {
    protected int[] result;
    protected int n;
 
    public Combination(int n, int length) {
        this.result = new int[length];
        this.n = n;
    }
 
    protected void generateKombinasiRek(int iStartValue, int curIdx) {
        // System.out.println("aaaa");
        if (curIdx == this.result.length) {
            process();
            // System.out.println("aaaa");
        } else {
            for (int i = iStartValue; i <= n - this.result.length + curIdx + 1; i++) {
                this.result[curIdx] = i;
                generateKombinasiRek(i + 1, curIdx + 1);
            }
        }
    }
 
    protected void process() {
        for (int i = 0; i < this.result.length; i++) {
            System.out.print(this.result[i]);
        }
        System.out.println();
    }
 
    public void generateKombinasi() {
        generateKombinasiRek(1, 0);
    }
}