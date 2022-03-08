import java.util.ArrayList;
/**
 * Modul - Tester ArrayList
 *
 * Erwin Darsono 6182001002
 * 17 November 2021
 */
public class TesterArrayList{
    public static void main(String[] args) {
        ArrayList objList = new ArrayList();
        System.out.println("size awal=" + objList.size());
        objList.add("test 1");
        
        System.out.println("size setelah dimasukan 1 elemen = " + objList.size());
        
        objList.add("test 2");
        objList.add("test 3");
        System.out.println("isi seluruh list");
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }
        
        objList.set(1,"test 4");
        System.out.println("isi seluruh list setelah diubah");
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }
    }
}