/**
 * Modul - Queue Array
 *
 * Erwin Darsono 6182001002
 * 1 Desember 2021
 */

class Queue_Array{
    protected Object[] arrObject;
    protected int tail;
    
    public Queue_Array(int size){
        arrObject = new Object[size];
        this.tail = 0;
    }
    
    public boolean isEmpty(){
        if(tail == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean offer(Object newObj){
        if(this.tail<arrObject.length){
            this.arrObject[this.tail] = newObj;
            this.tail = this.tail+1;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Object poll(){
        if(!this.isEmpty()){
            Object  = arrObject[0];
            for(int i = 1; i<tail; i++){
                arrObject[i-1] = arrObject[i];
            }
            arrObject[tail-1] = null;
            tail = tail-1;
            return ;
        }
        else{
            return null;
        }
    }
    
    public Object peek(){
        if(!this.isEmpty()){
            return arrObject[0];
        }
        else{
            return null;
        }
    }
    
    public int size(){
        return tail;
    }
}

public class MyQArray{
    public static void main(String[] args) {
        Queue_Array myQA = new Queue_Array(10);
        for(int i = 0; i < 10; i++){
            System.out.println(myQA.offer(i));
        }
        System.out.println(myQA.offer(11)); //meng-enqueue ke queue yang sudah penuh
        System.out.println(myQA.offer(12));
        
        System.out.println("");
        
        while(!myQA.isEmpty()){
            System.out.println(myQA.poll());
        }
        
        System.out.println(myQA.poll()); // men-dequeue dari queue yang kosong
        System.out.println(myQA.peek()); //peek queue yang sudah kosong
        
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            System.out.println(myQA.offer(i)); //melakukan enqueue sampai penuh
        }
        
        while(!myQA.isEmpty()){
            System.out.println(myQA.poll()); //men-dequeue queue sampai kosong
        }
        
        System.out.println(myQA.offer(1)); //melakukan enqueue kembali
        System.out.println(myQA.peek());
    }
}