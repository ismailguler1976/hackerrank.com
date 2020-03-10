package guler.solutions;
import java.util.Scanner;

abstract class BookII{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class MyBookII extends BookII {

	@Override
	void setTitle(String s) {
		this.title = s;
		
	}
	
}
public class SolutionAbstractClass {

	public static void main(String[] args) {
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
				Scanner sc=new Scanner(System.in);
				String title=sc.nextLine();
				MyBookII new_novel=new MyBookII();
				new_novel.setTitle(title);
				System.out.println("The title is: "+new_novel.getTitle());
		      	sc.close();
	}
}
