import java.util.*;

	public class Problem1 {
		public static void main(String[] args) {
	        ArrayList<Integer> Collections = new ArrayList<Integer> ();

	        Collections.add(2);
	        Collections.add(3);
	        Collections.add(1);
	        Collections.add(1);
	        Collections.add(1);
	        Collections.add(20);

	        Iterator iterator = Collections.iterator();

	        int sum = 0;
	        Iterator<Integer>  iter = Collections.iterator();
	        while ( iter.hasNext() ) {
	            sum += iter.next();
	        }

	        System.out.println(sum);
	    }
	}
