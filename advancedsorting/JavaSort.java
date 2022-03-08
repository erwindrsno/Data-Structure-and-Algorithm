
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 * Modul - JavaSort
 *
 * Erwin Darsono 6182001002
 * 6 Oktober 2021
 */

class Mahasiswa implements Comparable<Mahasiswa>{
    private String nama;
    private double indeksPrestasi;
    private int sksLulus;
    
    public Mahasiswa(String nama, double indeksPrestasi, int sksLulus){
        this.nama = nama;
        this.indeksPrestasi = indeksPrestasi;
        this.sksLulus = sksLulus;
    }
    
    @Override
    public int compareTo(Mahasiswa mhs){
        if(this.indeksPrestasi > mhs.indeksPrestasi){
            return 1;
        }
        else if (this.indeksPrestasi == mhs.indeksPrestasi)
            if(this.sksLulus > mhs.sksLulus){
                return 1;
            }
            else if(this.sksLulus == mhs.sksLulus){
                return 0;
            }
            else{
                return -1;
            } 
        else {
            return -1;
        }
    }
    
    @Override
    public String toString(){
        String mhs = this.nama + " " + this.indeksPrestasi+ " " +this.sksLulus;
        return mhs;
    }   
}

public class JavaSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mahasiswa[] msw = new Mahasiswa[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double iP = sc.nextDouble();
            int sks = sc.nextInt();
            msw[i] = new Mahasiswa(name,iP,sks);
        }
        // descending order
        //Arrays.sort(msw,Collections.reverseOrder());
        
        // ascending order
        Arrays.sort(msw);
        for (int i = 0; i < msw.length; i++) {
            System.out.println(i+1+"."+msw[i].toString());           
        }
    }
}