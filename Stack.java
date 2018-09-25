
public class stack{
    int stack[] = new int [5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top ++;
    }
    public void print(){
        for (int n :stack){
            System.out.println(n+"");
        }
    }
    public void pop(){
        top --;
        stack[top] = 0;

    }
    public static void main(String args[]){
        stack obj = new stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();
        obj.print();
    }
}
