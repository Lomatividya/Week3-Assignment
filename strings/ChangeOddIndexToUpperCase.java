package strings;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		char[] str = test.toCharArray();
		int S = str.length;
		for(int i = 0; i < S;i++) {
			
			if(i%2==0) {
			System.out.print(test.substring(i, i+1).toUpperCase());
			}
			else {
				System.out.print(test.substring(i, i +1).toLowerCase());
			}
	
		}
	}

}
