
public class NegativeAgeException extends Exception {
	String msg;
	public NegativeAgeException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
		
	}

}
