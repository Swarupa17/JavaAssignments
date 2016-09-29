
public class Rectangle extends AreaPeri {
   private double l,b;
	@Override
	void findArea(double dim1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void FindPerimeter(double dim1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void findArea(double dim1, double dim2) {
		// TODO Auto-generated method stub
		this.l=dim1;
		this.b=dim2;
		System.out.println("The area of Reactangle: "+(l*b));
	}

	@Override
	void FindPerimeter(double dim1, double dim2) {
		// TODO Auto-generated method stub
		this.l=dim1;
		this.b=dim2;
		System.out.println("The perimeter of Reactangle: "+(2*(l+b)));
	}

}
