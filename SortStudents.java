import java.util.*;
import java.util.ArrayList;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
class Checker2 implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa() == s2.getCgpa()) {
			if(s1.getFname().equals(s2.getFname())) {
				 if(s1.getId() == s2.getId()) {
					 return 0;
				 } else if(s1.getId() > s2.getId()) {
					 return -1;
				 } else {
					 return 1;
				 }
			} else {
				return s1.getFname().compareTo(s2.getFname());
			}
		} else if(s1.getCgpa() > s2.getCgpa()) {
			return -1;
		} 
		
		return 1;
	}
	
}
public class SortStudents
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Collections.sort(studentList, new Checker2());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}


