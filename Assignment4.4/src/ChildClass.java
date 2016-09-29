
public class ChildClass extends ParentClass {
	public ChildClass()
	{
		System.out.println("Default Constructor");
		
	}
	public ChildClass(String a)
	{
		super(a);
		System.out.println("Parametarized Constructor");
	}
}
