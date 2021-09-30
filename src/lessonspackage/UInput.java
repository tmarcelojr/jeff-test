package lessonspackage;

import java.util.Scanner;
public class UInput {

	
	public static void main(String[] args) {
		int inum;
		float fnum;
		double dnum;
		long lnum;
		boolean choice;
		String str;
		String str1;
		
		// declare the new scanner as a class -> System.in
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello");

		// different methods for accepting inputs
		System.out.print("Enter an int: ");
		inum = scan.nextInt();
		System.out.print("Enter a long: ");
		lnum = scan.nextLong();
		System.out.print("Enter a float: ");
		fnum = scan.nextFloat();
		System.out.print("Enter a double: ");
		dnum = scan.nextDouble();
		System.out.print("Enter a boolean: ");
		choice = scan.nextBoolean();
		
		// only takes first word, it will stop after the space bar is entered
		System.out.print("Enter a string: ");
		str = scan.next();
		
		// we can have an empty nextLine() so we can reach our next scan
		// because enter has it's own value/special meaning
		// when you use two string lines methods right after each other, we need to use this or else it will be put on the same line
		
		// next() can read the input only till the space. It can't read two words separated by a space. Also, next() places the cursor in the same line after reading the input. nextLine() reads input including space between the words (that is, it reads till the end of line \n ).
		scan.nextLine();
		
		// takes a sentence
		System.out.print("Enter an address: ");
		str1 = scan.nextLine();
		
		System.out.println();
		System.out.println("Results:");
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(choice);
		System.out.println(str);
		System.out.println(str1);
		
		
		// close scanner when done - good practice because it can cause a memory leak
		scan.close();
		
	}
}
