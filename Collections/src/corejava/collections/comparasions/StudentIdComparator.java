package corejava.collections.comparasions;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {
		   public int compare(Student student1, Student student2) {
		      if (student1.getId() < student2.getId()) {
		         return -1;        
		      }else if (o1.getId() > o2.getId()) {          
		         return 1;
		      } else {
		         return 0;        
		      }
		   }

}
