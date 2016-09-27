
public class Parent {
	public void method1(){
		 System.out.println ("Parent's method1()");
		}
		public void method2() {
		 System.out.println ("Parent's method2()");
		method1();
		}
		}
/*output of this program
 Parent's method2()
Child's method1()*/		 
