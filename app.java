import java.util.*;

//a recursive method is a method that calls itself
//with each method call the problem becomes simpler
//we must include a condition that leads to the method no longer making another call on itself!

public class app {
	
	//int num = 100;
	
	public static void main(String[] args) {

		app recursionTool = new app();
		System.out.println("Factorial: " + recursionTool.getFactorial(6));
	}
	int result;
	
	
	
	
public int getFactorial(int num) {
	System.out.println("Method " + num);
	if (num ==1) {
		System.out.println("Returned 1");
		return 1;
		
	}else {
		int result = num * getFactorial(num - 1);
		System.out.print("Returned " + result);
		System.out.println(" : " + num + " * getFactorial(" + num + "- 1)");
		return result;
	}
	
	
	
}

	
}	



/*
public int getNumber(int num) {
if (num==1) {
	return 1;
}else {
	return (num + getNumber(num-1));
}
}*/
//System.out.Println(num);