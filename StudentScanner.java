package homework;
import java.util.Scanner;

public class StudentScanner {
	public static Student scannerStudent () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input name: ");
		String name = sc.nextLine();
		System.out.print("Input Lasrname: ");
		String Lastname = sc.nextLine();
		System.out.print("Input Age: ");
		int age = sc.nextInt();
		System.out.print("Input gender: ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.print("Input id");
		long id = sc.nextLong();
		System.out.print("Input group");
		String group = sc.nextLine();
		Student student = new Student(name, Lastname, age, Gender.valueOf(gender), id, group);
		return student;
	}
}
