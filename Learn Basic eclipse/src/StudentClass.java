import java.util.Comparator;
import java.util.Objects;

public class StudentClass implements Comparable<StudentClass> {

	String name;
	int rollNo;
	
	public StudentClass(String name,int rollNo)
	{
		this.name  = name;
		this.rollNo = rollNo;
	}
	
     @Override
	 public String toString()
	 {
		 return "Studnet {Name "+name+ 
		           " roll no" + rollNo + "}";
	 }
	
	 @Override
	 public boolean equals(Object o)
	 {
		 if(this == o)  return true;
		 if(o==null || getClass()!=o.getClass()) return false;
		 StudentClass student = (StudentClass) o;
		 return student.rollNo == rollNo;
		 
		 
	 }
	 
	@Override 
	 public int hashCode()
	 {
		 return Objects.hash(rollNo);
		 
	 }
	
	@Override
	public int compareTo(StudentClass that)
	{
		return this.rollNo - that.rollNo;
	}
	
	 
	 
	
	
}
