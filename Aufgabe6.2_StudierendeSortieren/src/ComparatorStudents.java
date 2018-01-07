import java.util.Comparator;

public class ComparatorStudents implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int nachname = o1.getLastname().compareTo(o2.getLastname());
		int vorname = o1.getFirstname().compareTo(o2.getFirstname());
		if (nachname < 0){
			
			return -1;	
			
		} else if(nachname > 0){
			
			return 1;
			
		} else if (nachname == 0){
			
			if (vorname < 0){
				
				return -1;	
				
			} else if(vorname > 0){
				
				return 1;
				
			} else if (vorname == 0){
				
				if (o1.getMatriculationNumber() < o2.getMatriculationNumber()){
					return -1;
				} else {
					return 1;
				}
			
			}
		}
		return 0;
	}

	
	//a negative integer, zero, or a positive integer as the first argument 
	//is less than, equal to, or greater than the second.

}
