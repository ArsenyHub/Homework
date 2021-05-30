package homework;
import java.util.Comparator;

public class StudentComparator implements Comparator  {

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student) o1;
		Student st2 = (Student) o2;
		String lastname1 = st1.getLastname();
		String lastname2 = st2.getLastname();
		
		if(lastname1.compareTo(lastname2) >0) {
			return 1;
		}
		if (lastname1.compareTo(lastname2) <0) {
			return -1;
		}
		return 0;
	}
	 
}
