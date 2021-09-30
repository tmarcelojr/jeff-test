package lessonspackage;

public class Loops {

	public static void main(String[] args) {

		// Print numbers 1 to 50
		// Remember we have to specify the data type of our iterator "i"
		// We would use int for "i" because we know it is an integer
		for(int i = 1; i <= 50; i++) {
			
			// Print "i" in new line
			// System.out.println(i);
			
			// Print "i" in same line
			// System.out.print(i);
			
			// If you want to iterate by 2 change i++ to i+=2
		}
		
		// Print numbers 50 to 1
		for(int i = 50; i >= 1; i--) {
			// System.out.println(i);
		}
		
		// Pass on an empty to print space in the console
		System.out.println();
		
		for(int i = 50; i >= 1; i-=2) {
			// System.out.println(i);
		}
		
		// Nested for loops
		// Goal Output:
		// 1
		// 12
		// 123
		// 1234
		// 12345
		for(int r = 1; r <= 5; r++) {
			for(int c = 1; c <= r; c++) {
				// System.out.print(c);
			}
			// System.out.println();
		}
		
		// Goal Output:
		// 55555
		// 4444
		// 333
		// 22
		// 1
		for(int r = 5; r >= 1; r--) {
			// Method 1
			// for(int c = 1; c <= r; c++) {
			//	 System.out.print(r);
			// }
				
			// Method 2
			for(int c = r; c >= 1; c--) {
				// System.out.print(r);
			}
			// System.out.println();
		}
		
		// ===== WHILE LOOP =====
		int i = 1;
		
		// increment 
		while(i <= 50) {
			// System.out.println(i);
			i+=2;
		}
		
		int x = 50;
		// decrement
		while(x >= 0) {
			System.out.println(x);
			x-=2;
		}
		
		
		
	}

}
