import java.util.LinkedList;
/**
 * Modul - Tester Vector
 *
 * Erwin Darsono 6182001002
 * 17 November 2021
 */
public class TesterLinkedList{
    public static void main(String[] args) {
        LinkedList objList = new LinkedList();
        System.out.println("size awal = "+objList.size());
        objList.add("test1");
        
        System.out.println("size setelah dimasukkan 1 elemen = "+objList.size());
        
        objList.add("test2");
        objList.add("test3");
        System.out.println("isi seluruh list");
        for (int i = 0; i < objList.size(); i++){
            System.out.println(objList.get(i));
        }
        
        objList.set(1,"test4");
        System.out.println("isi seluruh list setelah diubah");
        for (int i = 0; i < objList.size(); i++) {
            System.out.println(objList.get(i));
        }
        System.out.println("\npengujian method-method tambahan milik linked list");
        objList.addLast("last");
        objList.addFirst("first");
        System.out.println(objList.removeFirst().toString());
        System.out.println(objList.peek().toString());
        System.out.println(objList.peek().toString());
    }
}