/**
 * Modul - ArrayStack
 *
 * Erwin Darsono 6182001002
 * 24 November 2021
 */
import java.util.Scanner;
class ArrayStack{
    private Object[] elements;
    private int top;
    
    public ArrayStack(int maxCapacity){
        this.elements = new Object[maxCapacity];
        this.top = 0;
    }
    
    public boolean push(Object newElement){
        if(this.top<elements.length){
            this.elements[top] = newElement;
            top++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Object pop(){
        Object poppedElement = null;
        if(this.top > 0){
            poppedElement = this.elements[top-1];
            top--;
        }
        return poppedElement;
    }
    
    public Object peek(){
        Object poppedElement = null;
        if(this.top > 0){
            poppedElement = this.elements[top-1];
        }
        return poppedElement;
    }
    
    public boolean isEmpty(){
        return this.top == 0;
    }
}

public class ArrStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCapacity = sc.nextInt();
        ArrayStack as = new ArrayStack(maxCapacity);
        
        Object tesPeek = as.peek();
        System.out.println(tesPeek);
        
        Object tesPop = as.pop();
        System.out.println(tesPop);
        
        boolean kosong = as.isEmpty();
        System.out.println(kosong);
        
        for (int i = 0; i < maxCapacity; i++) {
            int element = sc.nextInt();
            as.push(element);
        }
        tesPop = as.pop();
        System.out.println(tesPop);
        tesPop = as.pop();
        System.out.println(tesPop);
        tesPeek = as.peek();
        System.out.println(tesPeek);
        
        
    }
}