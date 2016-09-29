
public class ChildClass extends ParentClass {
	public ChildClass()
	{
		System.out.println("Default Constructor from child class");
		
	}
	public ChildClass(String a)
	{
		super(a);
		System.out.println("Parametarized Constructor from child class");
	}
}
