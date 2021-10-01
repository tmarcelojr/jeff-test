package lessonspackage;

public class Person {
	// ===== WHAT IS A CLASS? =====
	// • Template/blueprint to create an object
	
	// ===== HOW DO WE DEFINE OBJECT? =====
	// • Characteristics of object: every object has a state/properties and methods
	// • State is a characteristic of an object
	// • Method is a variable of an object
	
	// ===== HOW DO WE DEFINE A METHOD? =====
	// • Consist of business logic which consists of one purpose/task
	
	// ===== SIDE NOTES =====
	// Not every class needs to be instantiated.
	// Not all classes will have methods and variables.
	
	// Instance variables: these are not similar to your local variables
	// It's not best practice to put default values. 
	String pname;
	int page;
	char pgender;
	
	// Creating empty constructor - this is constructing an object.
	// Compiler can create an empty constructor for us if we don't create it.
	// This is called Constructor overloading. To test this out comment out the public Person() and the public Person(parameters...)
	// HOT TIP FOR INTERVIEW: If you are creating parametized constructor WE HAVE TO CREATE an empty constuctor. If we don't need to create parametized constructor, we can omit writing the both of them.
	public Person() {
		
	}
	
	// Creating parametized constructor
	// Why would we need to create parametized constructor? Let's say we have many instance variables. This way we can pass on only the variables we want to associate with this specific constructor.
	// And yes, we have can have multiple constructors.
	public Person(String name, int age, char gender) {
		pname = name;
		page = age;
		pgender = gender;
		
	}
	
	// Instance method or non-static method - needs to be invoked with object references. If you invoke this without object reference you will get compiler error. For example p1.display() is what you would need and display() will get an error.
	void display() {
		System.out.println("Name: " + this.pname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
	}
	
	// Static can be called without object references
	// This is a class method.
	// REMEMBER: void just means our method is not returning anything
	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		info();
		
		// Calling constructor
		Person p1 = new Person();
		
		p1.pname = "John";
		p1.page = 20;
		p1.pgender = 'M';  // note the single quotes

		
		p1.display();
		
		System.out.println("----------------");
		
		Person p2 = new Person();
		
		p2.pname = "Amy";
		p2.page = 22;
		p2.pgender = 'F';  // note the single quotes
		
		p2.display();
		
		// You can create as many objects as you want. We are creating instantiations of Person Class. Each person will have different values. 
	}

}
