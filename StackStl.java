 import java.util.Stack;
public class stack{
    public static void main (String args[]){
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.peek();
        System.out.println("Stack =>" + stack);
        System.out.println("peek is "+stack.peek());
    }
}
