
public class Chapter12 {
	public static int sum(int target){
		if (target <=0) { //base case 
			return 0;
		}
		else {
			return target + sum(target-1); //recursion code
		}
	}
	
	public static void main (String[] args) {
		int n = 10;
		int result = sum(n);
		System.out.println(result);	
		
		int a = 5;
		int product = product(a);
		System.out.println(product);
		
		int b = 15;
		int subtract = subtraction(b);
		System.out.println(subtract);
		}

	//Write a recursion method that calculates the product of all numbers from 1 to target number
	public static int product(int target){
		int result;
		if (target <= 1) { 
			result = 1;
		}
		else {
			result = target * product(target-1); 
		}
		return result;
	}
	// Write a recursion method for subtracting 
	public static int subtraction(int target){
		if (target <=0) { //base case 
			return 0;
		}
		else {
			return target - subtraction(target-1); //recursion code
		}
	}
}
