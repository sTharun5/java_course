package OOP;

public class stack {
	
	
private int arr[] = new int[10];
private int top = -1;
private int size = 10;

// methods are generally public

public void push(int ele) {
	
	if(size==top+1)
		System.out.println("Stack is Full");
	else
		arr[++top] = ele ;
	
}

public void pop() {
	if(top==-1)
		System.out.println("stack is empty");
	else {
		System.out.println(arr[top] + " is removed from the stack");
		top--;
		
	}
}
public void printStack() {
	for(int i=top;i>=0;i--) {
		System.out.println(arr[i]);
	}
}


}
