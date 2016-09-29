import java.util.Scanner;

public class TestAReaPeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dim1,dim2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value of dim1 and dim2:");
		dim1=s.nextDouble();
		dim2=s.nextDouble();
		System.out.println("--------Triangle--------");
		Triangle T1 = new Triangle();
		T1.findArea(dim1, dim2);
		T1.FindPerimeter(dim1);
		System.out.println("--------Circle--------");
		Circle C1=new Circle();
		C1.findArea(dim1);
		C1.FindPerimeter(dim1);
		System.out.println("--------Rectangle1--------");
		Rectangle R1=new Rectangle();
		R1.findArea(dim1, dim2);
		R1.FindPerimeter(dim1, dim2);

	}

}
