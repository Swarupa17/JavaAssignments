
public class Prime implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 int no;
	        for(no=2;no<=1000;no++)
	        {
	            int cnt=0;
	            for(int i=2;i<=no/2;i++)
	                if(no%i==0)
	                {
	                    cnt++;
	                    break;
	                }
	            if(cnt==0)
	                System.out.println(no+" Number is prime");
	        }
	}

}
