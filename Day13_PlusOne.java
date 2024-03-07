package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day13_PlusOne {

	public static void main(String[] args) {
int []digits= {9,8,7,6,5,4,3,2,1,0};
System.out.println((Arrays.toString(plusOne(digits))));
	}
	 public static int[] plusOne(int[] digits) {
		 for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] < 9) {
					digits[i]++;
					return digits;
				}
				digits[i] = 0;
			}

			digits = new int[digits.length + 1];
			digits[0] = 1;
			return digits;
	    }
}
