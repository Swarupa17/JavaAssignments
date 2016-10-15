import java.util.ArrayList;
import java.util.Collections;

public class HDTVDemo {
public static void main(String args[])
{
	HDTV tv1=new HDTV(45,"Samsung");
	HDTV tv2=new HDTV(32,"Sony");
	HDTV tv3=new HDTV(42,"Panasonic");
	ArrayList<HDTV> al=new ArrayList<HDTV>();
	al.add(tv1);
	al.add(tv2);
	al.add(tv3);
	Collections.sort(al,new SizeComparator());
	for(HDTV a: al)
	{
		System.out.println(a.getBrand());
	}
}
}
