#include<stdio.h>
#include<cs50.h>
int a[10];
int top = -1;
// inserting elements in stack 
void  push(int x){
    if (top==10){
        printf("overflow");
        return;
    }
    top+=1;
    a[top] = x;
} 
deleting element in a stack 
void pop(){
    if (top==-1){
        printf("underflow");
        return;
    }
    top--;
}
int Top(){
    return a[top];
}
/*void  isempty(){
    if (top==-1){
        return true;
    }
    return false;
}*/
// print elements in stack // 
void Print(){
    for(int i =0;i<=top;i++){
        printf("%i",a[i]);
    }
    printf("\n");
}
int main (){
    push(1);
    push(2);
    push(3);
   // pop();
    Top();
    Print();
    push(4);
    Print();

}
