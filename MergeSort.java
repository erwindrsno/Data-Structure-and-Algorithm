/**
 * Modul - MergeSort
 *
 * Erwin Darsono 6182001002
 * 13 Oktober 2021
 */
//import java.lang.Math;
//import java.util.Scanner;
//class MergeSort{
//    private void mergeSort(int[] inputArr, int left, int right){
//        if (left < right){
//            int mid = (int)Math.floor((left+right)/2);
//            mergeSort(inputArr,left,mid);
//            mergeSort(inputArr,mid+1,right);
//            merge(inputArr,left,mid,right);
//        }
//    }
//    
//    private void merge(int[] inputArr, int left, int mid, int right){
//        int leftSize = mid - left+1;
//        int rightSize = right - mid;
//        int[] tempArrLeft = new int[leftSize+1];
//        int[] tempArrRight = new int[rightSize+1];
//        for (int i = 0; i < leftSize; i++) {
//            tempArrLeft[i] = inputArr[left+i];   
//        }
//        for (int i = 0; i < rightSize; i++) {
//            tempArrRight[i] = inputArr[mid+1+i];
//        }
//        tempArrLeft[leftSize] = Integer.MAX_VALUE;
//        tempArrRight[rightSize] = Integer.MAX_VALUE;
//        int arrLeftIdx = 0;
//        int arrRightIdx = 0;
//        for (int i = left; i <= right; i++) {
//            if(tempArrLeft[arrLeftIdx]<=tempArrRight[arrRightIdx]){
//                inputArr[i] = tempArrRight[arrLeftIdx];
//                arrLeftIdx+=1;
//            }
//            else{
//                inputArr[i] = tempArrRight[arrRightIdx];
//                arrRightIdx += 1;
//            }
//        }
//    }
//        
//    public void sort(int[] inputArr){
//        mergeSort(inputArr, 0, inputArr.length-1);
//    }
//        
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int jlhElemen = sc.nextInt();
//        int[] input = new int[jlhElemen];
//        for (int i = 0; i < jlhElemen; i++) {
//            input[i] = sc.nextInt();        
//        }
//        MergeSort sorter = new MergeSort();
//        sorter.sort(input);
//        for (int i = 0; i < jlhElemen; i++) {
//            System.out.println(input[i]);    
//        }
//    }
//} 

//ASCENDING ORDER

import java.lang.Math;
import java.util.Scanner;
class MergeSort{
    private void mergeSort(int[] inputArr, int left, int right){
        if (left < right){
            int mid = (int)Math.floor((left+right)/2);
            mergeSort(inputArr,left,mid);
            mergeSort(inputArr,mid+1,right);
            merge(inputArr,left,mid,right);
        }
    }
    
    private void merge(int[] inputArr, int left, int mid, int right){
        int leftSize = mid - left+1;
        int rightSize = right - mid;
        int[] tempArrLeft = new int[leftSize+1];
        int[] tempArrRight = new int[rightSize+1];
        for (int i = 0; i < leftSize; i++) {
            tempArrLeft[i] = inputArr[left+i];   
        }
        for (int i = 0; i < rightSize; i++) {
            tempArrRight[i] = inputArr[mid+1+i];
        }
        tempArrLeft[leftSize] = Integer.MAX_VALUE;
        tempArrRight[rightSize] = Integer.MAX_VALUE;
        int arrLeftIdx = 0;
        int arrRightIdx = 0;
        for (int i = left; i <= right; i++) {
            if(tempArrLeft[arrLeftIdx]<=tempArrRight[arrRightIdx]){
                inputArr[i] = tempArrLeft[arrLeftIdx];
                arrLeftIdx+=1;
            }
            else{
                inputArr[i] = tempArrRight[arrRightIdx];
                arrRightIdx += 1;
            }
        }
    }
        
    public void sort(int[] inputArr){
        mergeSort(inputArr, 0, inputArr.length-1);
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jlhElemen = sc.nextInt();
        int[] input = new int[jlhElemen];
        for (int i = 0; i < jlhElemen; i++) {
            input[i] = sc.nextInt();        
        }
        MergeSort sorter = new MergeSort();
        sorter.sort(input);
        for (int i = 0; i < jlhElemen; i++) {
            System.out.println(input[i]);    
        }
    }
}