/**
 * Modul - Queue LinkedList
 *
 * Erwin Darsono 6182001002
 * 1 Desember 2021
 */

class QueueLL{
    protected MyLinkedList linkedList;
    
    public QueueLL(){
        linkedList = new MyLinkedList();
    }
    
    public boolean isEmpty(){
        if(linkedList.getSize() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean offer(Object newObj){
        linkedList.addLast(newObj);
        return true;
    }
    
    public Object poll(){
        if(!this.isEmpty()){
            return linkedList.removeFirst();
        }
        else{
            return null;
        }
    }
    
    public Object peek(){
        if(!this.isEmpty()){
            return linkedList.getNode(0).getInfo();
        }
        else{
            return null;
        }
    }
    
    public int size(){
        return linkedList.getSize();
    }
}

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
            this.head = newNode;
            this.tail = newNode;
        }
        
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        count = count + 1;
    }
    
    public void addFirst(Object info){
        MyNode newNode = new MyNode(info);
        if (head == null){
            head = newNode;
        }
        
        else {
            newNode.setNext(head);
            head = newNode;
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
            if(head == null){
                tail = null;
            }
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

public class MainQLL{
    public static void main(String[] args) {
        QueueLL myQLL = new QueueLL();
        System.out.println(myQLL.peek()); //peek queue yang kosong
        
        System.out.println(myQLL.poll()); //men-dequeu dari queue yang kosong
        
        System.out.println(myQLL.offer(1));
        //System.out.println(myQLL.offer(2));
        System.out.println(myQLL.peek());
        System.out.println(myQLL.isEmpty());
        System.out.println(myQLL.offer(2));
    }
}