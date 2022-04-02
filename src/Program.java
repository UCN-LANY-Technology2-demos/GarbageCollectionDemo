
public class Program {

	public static void main(String[] args) {
		
		Student student1 = new Student("Hans");
		Student student2 = new Student("Kurt");
		
//		student1 = null;
//		student2 = null;
		
		System.gc();
		
		System.out.println("Done");
	}

}
