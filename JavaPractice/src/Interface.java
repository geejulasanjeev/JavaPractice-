
public interface Interface {
	int x=0;
	
	public static void abc() {
		  System.out.print(""
		  		+ 
				  "Type of methods: Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.\n" + 
		  		"Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.\n" + 
		  		"Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.\n" + 
		  		"Implementation: Abstract class can provide the implementation of interface.	Interface can’t provide the implementation of abstract class.\n" + 
		  		"Inheritance vs Abstraction: A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.\n" + 
		  		"Multiple implementation: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.\n" + 
		  		"Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.");
	}
	
	public void abcc();
	
	


}
