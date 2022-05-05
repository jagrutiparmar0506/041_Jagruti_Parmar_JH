import java.util.*;
class Stack{
	int[] a;
	int size;
	int top1,top2;
	Stack(int n){
		size=n;
		a=new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	void push1(int x){
		if(top1>0){
			top1--;
			a[top1]=x;
		}
		else{
			System.out.print("Stack is Overflow:");
			return;
		}
	}
	void push2(int x){
		if(top2<size-1){
			top2++;
			a[top2]=x;
		}
		else{
			System.out.print("Stack is Overflow:");
			return;
		}
	}
	int pop1(){
		if(top1<=size/2){
			int x=a[top1];
			top1++;
			return x;
		}
		else{
			System.out.print("Stack is Underflow:");
		}
		return 0;
	}
	int pop2(){
		if(top2>=size/2+1){
			int x=a[top2];
			top2--;
			return x;
		}
		else{
			System.out.print("Stack is Underflow:");
		}
		return 1;
	}
	public static void main(String... args){
		Stack s=new Stack(10);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("Popped element from stack one: "+s.pop1());
		System.out.println("Popped element from stack two: "+s.pop2());
		
	}
}