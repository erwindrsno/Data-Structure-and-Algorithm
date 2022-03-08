
import java.util.Scanner;

/**
 * Modul - LinkedList Stack
 *
 * Erwin Darsono 6182001002
 * 24 November 2021
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

class MyLinkedListStack{
    private MyNode top;
    private int count;
    
    public MyLinkedListStack(){
        top = null;
        count = 0;
    }
    
    public void push(Object info){
        MyNode newNode = new MyNode(info);
        if (top == null){
            top = newNode;
        }
        
        else {
            newNode.setNext(top);
            top = newNode;
        }
        count = count + 1;
    }
    
    public Object pop(){
        if (top == null){
            return null;
        }
        else {
            count = count - 1;
            MyNode removedNode = top;
            top = top.getNext();
            return removedNode.getInfo();
        }
    }
    
    public MyNode getFirst(int idx){
        if (top == null){
            return null;
        }
        
        int i = 0;
        MyNode cur = top;
        while (i < idx){
            cur = cur.getNext();
            i++;
        }
        return cur;
    }
        
    public void printAllInfo(){
        MyNode cur = top;
        while(cur!=null){
            System.out.print(cur.getInfo().toString()+" ");
            cur = cur.getNext();
        }
    }
}

public class LLStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCapacity = sc.nextInt();
        MyLinkedListStack as = new MyLinkedListStack();
        
        for (int i = 0; i < maxCapacity; i++) {
            int a = sc.nextInt();
            as.push(a);
        }
        as.printAllInfo();
    }
}