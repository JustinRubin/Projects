/*
Project Euler - Problem #1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class ProjectEuler_Multiples_3_5 {

	public static void main(String[] args) {
		
		// initialize integers to contain results of modulo tests
		int mod3 = -1;
		int mod5 = -1;
		
		int[] results = new int[1000];  // array to store results (don't actually know how large to use)
		int j = 0;  // counter to hold index of 'results' to enter next answer
		
		int sumResults = 0;  // sum of results
		
		for (int i = 0; i < 1000; i++) {
			
			mod3 = i % 3;
			mod5 = i % 5;
			
			if (mod3 == 0 || mod5 == 0) {
				results[j] = i;
				System.out.print(i);
				sumResults += i;
				j++;
			}
				
		} // end for
				
		System.out.println("\n" + sumResults);

	}

}
