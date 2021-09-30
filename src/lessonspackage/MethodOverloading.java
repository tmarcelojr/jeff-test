package lessonspackage;

public class MethodOverloading {

	// method overloading two or more methods with the same name
		// methods must be in the same class file
		// different parameters
		// different types of parameters
		// if signatures are different, it will compile
		// if signatures are not different (or are the same) it will not compile the code
		
		// void is replaced with the type of data returned by the method
		
		// takes two ints, returns one int
		public static int add(int i, int j) {
			int sum = i + j;
			return sum;
		}
		// takes three int, returns one int
		static int add(int i, int j, int k) {
			return i + j +k;
		}
		
		// takes two ints + one double returns a double
		static double add(int i, int j, double k) {
			return i + j + k;
		}
		
		// takes single char => PRINTS single char
		// not returning /-> write 'void'
		static void display(char onechar) {
			System.out.println(onechar);
		}
		
		// takes a string => Prints string (not returning -> note void_)
		static void display(String name) {
			System.out.println(name);
		}
		
		public static void main(String[] args) {

			System.out.println(add(2,4));
			System.out.println(add(2,4,6));
			System.out.println(add(100, -2, 343.3));
			
			// reminder a char is single quotes & string is double quotes
			display('a');
			display("Jonny");
			display('x');
		}

}
