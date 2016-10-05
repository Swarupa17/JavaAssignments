
public class Perfect implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int no;
        for(no=1;no<=1000;no++)
        {
            int sum=0;
            for(int i=1;i<=no/2;i++)
            {
                if(no%i==0)
                    sum=sum+i;
            }
            if(no==sum)
                System.out.println(no+" Number is perfect");
        }
		
	}

}
