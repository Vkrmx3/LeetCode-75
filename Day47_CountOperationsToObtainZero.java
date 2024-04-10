package LeetCode75;

public class Day47_CountOperationsToObtainZero {

	public static void main(String[] args) {
		System.out.println(countOperations(2, 3));
	}
	 public static int countOperations(int num1, int num2) {
	        int operation=0;
	        while(num1>0 && num2>0)
	        {
	            if(num1>=num2)num1-=num2;
	            else num2-=num1;
	            operation++;
	        }
	        return operation;
	    }
}
