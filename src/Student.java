
public class Student {

	private String name;

	public String getName() {
		return name;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {

		System.out.println(this.name + " is garbage collected");
	}
}
