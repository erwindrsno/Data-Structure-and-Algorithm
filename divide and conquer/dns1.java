import java.util.Scanner;

public class dns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = sc.nextInt();
        }
        MyArray myArr = new MyArray(array);
        System.out.println("Sum in array = " + myArr.sumInArray());
        System.out.println(myArr.pjgArray());
    }
}

// class MyArray {
// int[] array;

// public MyArray(int[] array) {
// this.array = array;
// }

// private int sumInArrayRek(int awal, int akhir) {
// if (awal == akhir) {
// return this.array[awal];
// } else {
// int tengah = (awal + akhir) / 2;
// int jumlahKiri = sumInArrayRek(awal, tengah);
// int jumlahKanan = sumInArrayRek(tengah + 1, akhir);
// return jumlahKiri + jumlahKanan;
// }
// }

// public int sumInArray() {
// return sumInArrayRek(0, this.array.length - 1);
// }
// }
// tanpa gunakan Systemarraycopy();

class MyArray {
    int[] arr;

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    private int sumInArrayRek(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            // ukuran dari sub-array kiri
            int panjangKiri = (arr.length) / 2;
            // ukuran dari sub-array kanan
            int panjangKanan = arr.length - panjangKiri;
            int[] arrKiri = new int[panjangKiri];
            int[] arrKanan = new int[panjangKanan];

            // menyalin isi dari arr pada indeks ke-0 sebanyak panjangKiri buah elemen
            // ke indek ke-0 arrKiri
            System.arraycopy(arr, 0, arrKiri, 0, panjangKiri);

            // sama, tapi ini panjangKanan
            System.arraycopy(arr, panjangKiri, arrKanan, 0, panjangKanan);
            return sumInArrayRek(arrKiri) + sumInArrayRek(arrKanan);
        }

    }

    public int sumInArray() {
        return sumInArrayRek(this.arr);
    }

    public int pjgArray() {
        return arr.length;
    }
}
// menggunakan system array copy
