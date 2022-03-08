
import java.util.Scanner;


/**
 * Modul - InsertionSort
 *
 * Erwin Darsono 6182001002
 * 6 Oktober 2021
 */
public class InsertionSort{
    static int[] sort(int[] array){
        int n = array.length;
        int i, j, key;
        for (i = 1; i < n; i++) {
            j = i-1;
            key = array[i];
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        return array;
    }
    
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