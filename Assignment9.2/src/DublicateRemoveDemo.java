import java.util.ArrayList;
import java.util.HashSet;

public class DublicateRemoveDemo {
    static ArrayList<String> removeDuplicates(ArrayList<String> list)
    {   ArrayList<String> result = new ArrayList<>();
        HashSet<String> set= new HashSet<>();
        for (String item:list)
        {
        	if(!set.contains(item))
        	{
        		result.add(item);
        		set.add(item);
        	}
        }
		return result;
    	
    }
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("dog");
		list.add("cat");
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("bird");

		// Remove duplicates from ArrayList of Strings.
		ArrayList<String> unique = removeDuplicates(list);
		for (String element : unique) {
		    System.out.println(element);
		}
	    }
		
	}


