package homework;

public class Student extends Human {
	private long idBook;
	private String groupName;
	
	public Student(String name, String lastname, int age, Gender gender,long idBook, String groupName) {
		super(name, lastname, age, gender);
		this.idBook = idBook;
		this.groupName = groupName;
	}
	public Student() {
		super();
	}
	public long getIdBook() {
		return idBook;
	}
	public void setIdBook(long idBook) {
		this.idBook = idBook;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	@Override
	public String toString() {
		return "Student idBook= " + idBook + ", groupName= " + groupName+" " + super.toString() + " ";
	}
	
	
	
	
	
}
