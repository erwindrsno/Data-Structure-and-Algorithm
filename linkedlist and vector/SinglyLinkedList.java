/**
 * Modul - Singly Linked List
 *
 * Erwin Darsono 6182001002
 * 17 November 2021
 */
class MyNode{
    private Object info;
    private MyNode next;
    
    public void setNext(MyNode next){
        this.next = next;
    }
    
    public MyNode getNext(){
        return next;
    }
    
    public Object getInfo(){
        return info;
    }
    
    public void setInfo(Object info){
        this.info = info;
    }
    
    public MyNode(Object info){
        this.info = info;
        this.next = null;
    }
}

class MyLinkedList{
    private MyNode head;
    private MyNode tail;
    private int count;
    
    public MyLinkedList(){
        head = null;
        count = 0;
    }
    
    public void addLast(Object info){
        MyNode newNode = new MyNode(info);
        if (head == null){
            head = newNode;
        }
        
        else {
            MyNode cur = head;
            while (cur.getNext()!=null){
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        count = count + 1;
    }
    
    public void addFirst(Object info){
        MyNode newNode = new MyNode(info);
        if (head == null){
            head = newNode;
//            tail = newNode;
        }
        
        else {
            newNode.setNext(head);
            head = newNode;
//            while (cur.getNext()!=null){
//                cur = cur.getNext();
//            }
        }
        count = count + 1;
    }
    
    public Object removeFirst(){
        if (head == null){
            return null;
        }
        else {
            count = count - 1;
            MyNode removedNode = head;
            head = head.getNext();
            return removedNode.getInfo();
        }
    }
    
    public Object removeLast(){
        if (head == null){
            return null;
        }
        else {
            count = count - 1;
            MyNode removedNode = head;
            tail = head;
            while(removedNode.getNext()!=null){
                tail = removedNode;
                removedNode = removedNode.getNext();
            }
            tail.setNext(null);
            return tail.getInfo();
        }
    }
    
    public Object removeFrom(MyNode kiri, MyNode kanan){
        MyNode temp = head;
        while(temp.getNext()!=kiri){
            temp = temp.getNext();
        }
        MyNode counter = temp;
        while(counter!=kanan){
            count = count - 1;
            counter = counter.getNext();
        }
        temp.setNext(kanan.getNext());
        return temp;
    }
        
    public Object removeANode(MyNode index){
        MyNode temp = head;
        if (index == head){
            head = head.getNext();
            MyNode counter = temp;
            count = count - 1;
            return temp.getInfo();
        }
        else {
            while (temp.getNext()!=index){
                temp = temp.getNext();
            }
            MyNode counter = temp;
            while(counter!=index){
                count = count - 1;
                counter = counter.getNext();
            }
            temp.setNext(index.getNext());
            return temp.getInfo();
        }
    }
    
    public MyNode getNode(int idx){
        if (head == null){
            return null;
        }
        
        int i = 0;
        MyNode cur = head;
        while (i < idx){
            cur = cur.getNext();
            i++;
        }
        return cur;
    }
    
    public void addAfter(MyNode prevNode, Object info){
        MyNode newNode = new MyNode(info);
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        count = count + 1;
    }
    
    public Object removeAfter(MyNode prevNode){
        if (head == null){
            return null;
        }
        
        else {
            count = count - 1;
            MyNode removedNode = head;
            while (removedNode!=prevNode.getNext()){
                removedNode = removedNode.getNext();
            }
            prevNode.setNext(removedNode.getNext());
            removedNode = null;
            return prevNode;
        }
    }
    
    public int getSize(){
        return count;
    }
    
    public void printAllInfo(){
        MyNode cur = head;
        while(cur!=null){
            System.out.print(cur.getInfo().toString()+" ");
            cur = cur.getNext();
        }
    }
}

public class SinglyLinkedList{
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.addLast((5));
        myLL.addLast((2));
        myLL.addLast((3));
        System.out.print("Setelah addLast : ");
        myLL.printAllInfo();
        System.out.println("");
        
        myLL.addFirst(new Integer(7));
        myLL.addFirst(new Integer(10));
        myLL.addFirst(new Integer(12));
        System.out.print("Setelah addFirst : ");
        myLL.printAllInfo();
        System.out.println("");
//        
//        myLL.removeFirst();
//        System.out.print("Setelah removeFirst : ");
//        myLL.printAllInfo();
//        System.out.println("");
//        
//        myLL.removeLast();
//        System.out.print("Setelah removeLast : ");
//        myLL.printAllInfo();
//        System.out.println("");
//        
//        System.out.print("getNode index ke-2 : ");
//        System.out.print(myLL.getNode(1).getInfo());
//        System.out.println("");
//        
//        System.out.print("Setelah addAfter index ke-1 dengan int 90 : ");
//        myLL.addAfter(myLL.getNode(0), new Integer(90));
//        myLL.printAllInfo();
//        System.out.println("");
//        
//        System.out.print("Setelah removeAfter index ke-4 : ");
//        myLL.removeAfter(myLL.getNode(3));
//        myLL.printAllInfo();
//        System.out.println("");
//        
//        System.out.print("Panjang Linked List : ");
//        System.out.println(myLL.getSize());
//        System.out.println("");
//        
        System.out.println("Setelah remove node ke - 1");
        myLL.removeANode(myLL.getNode(0));
        myLL.printAllInfo();
        System.out.println("");
        
        System.out.println(myLL.getSize());
    }
}