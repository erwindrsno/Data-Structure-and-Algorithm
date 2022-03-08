
import java.util.Scanner;

/**
 * Modul - QuickSortLomuto
 *
 * Erwin Darsono 6182001002
 * 13 Oktober 2021
 */
class QuickSortLomuto {
    private void quickSort(int[] inputArr, int left, int right){
        if(left < right){
            int pivotIdx = lomutoPartition(inputArr,left,right);
            quickSort(inputArr,left,pivotIdx-1);
            quickSort(inputArr,pivotIdx+1,right);
        }
    }
    private int lomutoPartition(int[] inputArr, int left, int right){
        int pivot = inputArr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if(inputArr[j] <= pivot){
                i += 1;
                int temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
            }
        }
        i += 1;
        int temp = inputArr[i];
        inputArr[i] = inputArr[right];
        inputArr[right] = temp;
        return i;
    }
    public void sort(int[] inputArr){
        quickSort(inputArr, 0, inputArr.length-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jlhElemen = sc.nextInt();
        int[] input = new int[jlhElemen];
        for (int i = 0; i < jlhElemen; i++) {
            input[i] = sc.nextInt();        
        }
        QuickSortLomuto sorter = new QuickSortLomuto();
        sorter.sort(input);
        for (int i = 0; i < jlhElemen; i++) {
            System.out.println(input[i]);    
        }
    }
}
