
import java.util.Scanner;

/**
 * Modul - Count Sort
 *
 * Erwin Darsono 6182001002
 * 13 Oktober 2021
 */
class Count_Sort {
    public static int[] internalSort(int[]arrA, int[] arrB, int max){
        int[] arrC = new int[max+1];
        int i, j;
        int n = arrA.length;
        for (j = 0; j < n; j++) {
            arrC[arrA[j]]+=1;
        }
        for (i = 1; i <= max; i++) {
            arrC[i] = arrC[i] + arrC[i-1];
        }
        for (j = n-1; j >= 0; j--){
            arrB[arrC[arrA[j]]-1] = arrA[j];
            arrC[arrA[j]]--;
        }
        return arrB;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jlhElemen = sc.nextInt();
        int[] input = new int[jlhElemen];
        int[] res = new int[jlhElemen];
        for (int i = 0; i < jlhElemen; i++) {
            input[i] = sc.nextInt();        
        }
        Count_Sort sorter = new Count_Sort();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < jlhElemen; i++) {
            if(max <= input[i]){
                max = input[i];
            }
        }
        sorter.internalSort(input,res,max);
        for (int i = 0; i < jlhElemen; i++) {
            System.out.println(res[i]);    
        }
    }
}
