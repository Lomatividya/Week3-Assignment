package Arrays;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] no = {1,2,3,4,7,6,8};
		int length = no.length + 1;
		
		Arrays.sort(no);	
		int sum = length*(length+ 1)/2;
		
        for(int i = 0; i<no.length;i++) {
			
			sum = sum - no[i];
		}
		System.out.println("The Missing Element is = "+sum);
	}
}
