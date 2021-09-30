package lessonspackage;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		// declare variables
		int num;
		char onechar;
		String name;
		String othername;
		String str = "the";
		String quote = "This is a quote lol.";
		
		// new scanner
		Scanner scan = new Scanner(System.in);
		
		// user inputs
		System.out.println("===== Enter values =====");
		System.out.print("Enter int: ");
		num = scan.nextInt();
		System.out.print("Enter a character: ");
		onechar = scan.next().charAt(0);
		
		// Divider for two string inputs
		scan.nextLine();
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter a different name: ");
		othername = scan.nextLine();
		
		System.out.print("Enter a string keyword: ");
		str = scan.nextLine();
		
		System.out.print("Enter a quote: ");
		quote = scan.nextLine();
		
		// Divider
		System.out.println();
		
		// input results
		System.out.println("======== Results =======");
		System.out.println(num);
		System.out.println(onechar);
		System.out.println(name);
		System.out.println(othername);
		
		// Divider
		System.out.println();
		
		System.out.println("The name is the same as the other name (case sensitive): " + name.equals(othername));
		System.out.println("The name is the same as the other name (ignore case): " + name.equalsIgnoreCase(othername));
		System.out.println("Is our name input empty? " + name.isEmpty());
		System.out.println("Does our quote contain our str input? " + str + ": " + quote.contains(str));
		System.out.println("Substring with start and end positions: " + quote.substring(0, 10));
		System.out.println("Substring with starting position only: " + quote.substring(3));
		
		// REMINDER: Strings are not immutable. 
		
		// close scanner
		scan.close();
	}

}
