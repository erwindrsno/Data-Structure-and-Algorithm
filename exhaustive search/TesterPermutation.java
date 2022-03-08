import java.util.Scanner;
 
public class TesterPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Permutation objPermutasi = new Permutation(n);
        objPermutasi.generatePermutasi();
    }
}
 
class Permutation {
    protected int[] result;
    protected boolean[] mark;
 
    public Permutation(int n) {
        this.result = new int[n];
        this.mark = new boolean[n];
    }
 
    protected void generatePermutasiRek(int curIdx) {
        if (curIdx == -1) {
            process();
        } else {
            for (int i = 0; i < result.length; i++) {
                if (this.mark[i] == true) {
                    this.mark[i] = false;
                    result[curIdx] = i;
                    generatePermutasiRek(curIdx - 1);
                    this.mark[i] = true;
                }
            }
        }
    }
 
    protected void process() {
        for (int i = 0; i < this.result.length; i++) {
            System.out.print(this.result[i]);
        }
        System.out.println();
    }
 
    public void generatePermutasi() {
        for (int i = 0; i < this.mark.length; i++) {
            this.mark[i] = true;
        }
        generatePermutasiRek(this.result.length - 1);
    }
}