
import java.util.Scanner;

/**
 * Modul - QuickSortLomuto
 *
 * Erwin Darsono 6182001002
 * 13 Oktober 2021
 */
class QSHoare_Partition {
    private void quickSort(int[] inputArr, int left, int right){
        if(left<right){
            int pivotIdx = hoarePartition(inputArr,left,right);
            quickSort(inputArr,left,pivotIdx);
            quickSort(inputArr,pivotIdx+1,right);
        }
    }
    
    private int hoarePartition(int[] inputArr, int left, int right){
        int pivot = inputArr[left];
        int i = left-1;
        int j = right+1;
        while(true){
            do{
                j += 1;
            }while(inputArr[j]>pivot);
            do{
                i += 1;
            }while(inputArr[i]<pivot);
            if(i<j){
                int temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
            }
            else{
                return j;
            }
        }
    }
    
    public void sort(int[] inputArr){
        quickSort(inputArr,0,inputArr.length-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jlhElemen = sc.nextInt();
        int[] input = new int[jlhElemen];
        for (int i = 0; i < jlhElemen; i++) {
            input[i] = sc.nextInt();        
        }
        QSHoare_Partition sorter = new QSHoare_Partition();
        sorter.sort(input);
        for (int i = 0; i < jlhElemen; i++) {
            System.out.println(input[i]);    
        }
    }
}
