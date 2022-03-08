
import java.util.Stack;

/**
 * Modul - Stack Java
 *
 * Erwin Darsono 6182001002
 * 24 November 2021
 */

public class StackJava{
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        Stack<Integer> myStack2 = new Stack<Integer>();
        myStack.push(5);
        myStack.push(7);
        myStack2.push(5);
        myStack2.push(6);
//        System.out.println(myStack.peek());
//        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.pop();
        //System.out.println(myStack.peek());
        System.out.println(myStack.empty());
//        System.out.println(myStack.empty());
//        //System.out.println(myStack.pop());
//        System.out.println(myStack.empty());
        
//        if(myStack.pop().equals(myStack2.peek())){
//            System.out.println(myStack2.peek());
//        }
    }
}