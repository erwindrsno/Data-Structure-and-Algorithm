
import java.util.Scanner;


/**
 * Modul - SelectionSort
 *
 * Erwin Darsono 6182001002
 * 6 Oktober 2021
 */
public class SelectionSort{
    static int[] sort(int[] array){
        int n = array.length;
        int i, j, min, temp;
        for (i = 0; i < n-1; i++) {
            min = i;
            for (j = i+1; j < n; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    } // Ascending ORder
    
//    static String[] sort(int[] array,String[] nameB){
//        int n = array.length;
//        int i, j, min, temp;
//        for (i = 0; i < n-1; i++) {
//            min = i;
//            for (j = i+1; j < n; j++) {
//                if(array[j]>array[min]){
//                    min = j;
//                }
//            }
//            temp = array[min];
//            array[min] = array[i];
//            nameB[min] = nameB[i];
//            array[i] = temp;
//        }
//        return nameB;
//    }
    // Descending Order
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        for (int j = 0; j < n; j++) {
            System.out.print(array[j]+" "); 
        }
    }
}