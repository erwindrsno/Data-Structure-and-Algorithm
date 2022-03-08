
import java.util.Scanner;

/**
 * Modul - Searching
 *
 * Erwin Darsono 6182001002
 * 20 Oktober 2021
 */

//recursive
//public class Binary_Search{
//    public static int binarySearch(int[] a, int x){
//        return internalBinarySearch(a, x, 0, a.length-1);
//    }
//    
//    private static int internalBinarySearch(int[] a, int x, int indexBawah, int indexAtas){
//        if (indexAtas < indexBawah){
//            return -1;
//        }
//        else {
//            int indexTengah = (indexAtas + indexBawah) / 2;
//            if (a[indexTengah] == x){
//                return indexTengah;
//            }
//            else if (a[indexTengah] > x){
//                return internalBinarySearch(a, x , indexBawah, indexTengah - 1);
//            }
//            else {
//                return internalBinarySearch(a, x, indexTengah + 1, indexAtas);
//            }
//        }
//    }
//    
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int findX = sc.nextInt();
//        System.out.println(binarySearch(arr,findX));
//    }
//}

//Iterative
public class Binary_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int findX = sc.nextInt();
        System.out.println(cariX(arr,findX));
    }
    
    public static int cariX(int[] arr, int findX){
        int idxTop = arr.length-1;
        int idxBot = 0;
        int idxMid;
        do{
            idxMid = (idxTop+idxBot)/2;
            if(arr[idxMid]>findX){
                idxTop = idxMid-1;
            }
            else{
                idxBot = idxMid+1;
            }
            if(idxTop < idxBot){
                idxMid = -1;
                break;
            }
        }while(arr[idxMid]!=findX);
        
        return idxMid;
    }
}