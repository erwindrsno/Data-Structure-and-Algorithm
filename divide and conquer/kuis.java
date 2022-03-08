import java.util.Scanner;

public class kuis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int pjgArr = sc.nextInt();
        int[] arr1 = new int[pjgArr];
        int[] arr2 = new int[pjgArr];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        if(pjgArr == 1){
            System.out.printf("%.1f",findMed1(arr1,arr2));
            System.out.println("");
        }
        
        else if(pjgArr == 2){
            System.out.printf("%.1f",findMed2(arr1,arr2));
            System.out.println("");
        }
        
        else if(pjgArr > 2){
            findMed3(arr1,arr2);
        }
    }
    
    public static double findMed1(int[] arr1, int[] arr2){
        double res = 0;
        res = (arr1[0] + arr2[0])/2;
        return res;
    }
    
    public static double findMed2(int[] arr1, int[] arr2){
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] <= min1){
                min1 = arr1[i];
            }
        }
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] <= min2){
                min2 = arr2[i];
            }
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] >= max1){
                max1 = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] >= max2){
                max2 = arr2[i];
            }
        }
        int min = 0;
        int max = 0;
        if(min1 >= min2){
            max = min1;
        }
        else{
            max = min2;
        }
        if(max1 >= max2){
            min = max2;
        }
        else{
            min = max1;
        }
        double res = (max + min)/2.0;
        System.out.println(max);
        System.out.println(min);  
        return res;
    }
    
    public static void findMed3(int[] arr1, int[] arr2){
        double med1 = 0;
        double med2 = 0;
        int idxMid1 = (arr1.length-1)/2;
        int idxMid2 = (arr2.length-1)/2;
        med1 = (arr1[idxMid1]+arr1[idxMid1+1])/2;
        med2 = (arr2[idxMid2]+arr2[idxMid2+1])/2;
        if(med1 == med2){
            System.out.printf("%.1f",med1);
            System.out.println("");
        }
    }
}