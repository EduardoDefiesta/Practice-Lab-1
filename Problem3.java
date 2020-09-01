import java.util.Map;
import java.util.TreeMap;


public class Problem3 {
	public static void main(String[] args) {

        Date d1 = new Date(6, 19, 2001);
        Date d2 = new Date(4, 21, 2000);
        Date d3 = new Date(3, 27, 2001);
        Date d4 = new Date(6, 20, 2001);

        TreeMap<Date, String> syllabus = new TreeMap<>();
        syllabus.put(d1, "Java");
        syllabus.put(d2, "Phyton");
        syllabus.put(d3, "C++");
        syllabus.put(d4, "Javascript");

        for(Map.Entry<Date, String> entry: syllabus.entrySet()){
            if(entry.getKey().month == 9 && entry.getKey().year == 2002)
                System.out.println(entry.getValue());
        }

    }
}
