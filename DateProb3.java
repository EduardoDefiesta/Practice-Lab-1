
public class DateProb3 implements Comparable<Date> {
	//Initialize the variables
    int month;
    int day;
    int year;

    //Constructors
    Date(int m, int d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public int compareTo(Date other) {
        if (this.year < other.year)
            return -1;
        else if(this.year > other.year)
            return 1;
        else{
            if(this.month < other.month)
                return -1;
            else if(this.month > other.month)
                return 1;
            else{
                if(this.day < other.day)
                    return -1;
                else if(this.day > other.day)
                    return 1;
                else{
                    return 0;
                }
            }
        }
    }
}
