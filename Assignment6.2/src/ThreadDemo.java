
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Perfect p=new Perfect();
          Thread t1=new Thread(p);
          Prime p1=new Prime();
          Thread t2=new Thread(p1);
          t1.start();
          t2.start();
	}
	

}
