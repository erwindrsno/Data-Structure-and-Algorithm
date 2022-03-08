import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int idxTc = 0;
        while (idxTc < tc) {
            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = sc.nextInt();
            }
            MyArray1 myArr = new MyArray1(arr);
            System.out.println("Kasus ke-1: " + myArr.findMax());
            idxTc++;
        }
    }
}

class MyArray1 {
    int[] arr;

    public MyArray1(int[] arr) {
        this.arr = arr;
    }

    private int findMaxRek(int[] arr, int awal, int akhir) {
        if (awal == akhir) {
            return this.arr[awal];
        } else {
            int tengah = (int) Math.floor((awal + akhir) / 2);
            int maxKiri = findMaxRek(arr, awal, tengah);
            int maxKanan = findMaxRek(arr, tengah + 1, akhir);
            if (maxKiri > maxKanan) {
                return maxKiri;
            } else {
                return maxKanan;
            }
        }
    }

    public int findMax() {
        return findMaxRek(arr, 0, this.arr.length - 1);
    }
}