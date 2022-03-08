class PriorityQueueArray{
    protected Object[] arrObject;
    protected int head;
    
    public PriorityQueueArray(int size){
        this.arrObject = new Object[size];
        this.head = -1;
    }
    
    public boolean isEmpty(){
        return (this.head == -1);
    }
    
    public boolean offer(Object newObj){
        if(head == arrObject.length-1){
            return false;
        }
        else{
            Comparable asComp = (Comparable)newObj;
            int i = head;
            while( (i>=0) && (asComp.compareTo(arrObject[i])>0)){
                arrObject[i+1] = arrObject[i];
                i--;
            }
            arrObject[i+1] = newObj;
            this.head = this.head+1;
            return true;
        }
    }
    
    public Object poll(){
        if(head == 1){
            return null;
        }
        else{
            Object  = arrObject[this.head];
            arrObject[this.head] = null;
            this.head = this.head-1;
            return ;
        }
    }
    
    public Object peek(){
        if (this.head == -1){
            return null;
        }
        else{
            return arrObject[this.head];
        }
    }
    
    public int size(){
        return head+1;
    }
}

public class Priority_Queue{
    public static void main(String[] args) {
        PriorityQueueArray myPQA = new PriorityQueueArray(5);
        for (int i = 0; i < myPQA.size(); i++) {
            System.out.println(myPQA.offer(i));
        }
        while(!myPQA.isEmpty()){
            System.out.println(myPQA.poll());
        }
        System.out.println(myPQA.peek());
    }
}