package homework;

import java.util.Arrays;



public class Main {

	public static void main(String[] args) throws Exception {
		Student[] students = new Student[10];
		students[0] = new Student("Ivan", "Kucha", 20, Gender.MALE, 7851, "Programming");
		students[1] = new Student("Alex", "Smirnov", 22,  Gender.MALE, 7883, "Programming");
		students[2] = new Student("Nastya", "Radchenko", 18,  Gender.FEMALE,7994, "Programming");
		students[3] = new Student("Vova", "Muchev", 19,  Gender.MALE, 7685, "Programming");
		students[4] = new Student("Katya", "Chernova", 22,  Gender.FEMALE, 7319, "Programming");
		students[5] = new Student("Pasha", "Morozov", 18,  Gender.MALE, 7371, "Programming");
		students[6] = new Student("Lena", "Mechnikova", 20,  Gender.FEMALE, 7874, "Programming");
		students[7] = new Student("Vlad", "Molchun", 21,  Gender.MALE, 7040, "Programming");
		students[8] = new Student("Olya", "Grizko", 23,  Gender.FEMALE, 2331, "Programming");
		Student student = StudentScanner.scannerStudent(); 
		 
		Group group = new Group();
		group.addStudent(students[0]);
		group.addStudent(students[1]);
		group.addStudent(students[2]);
		group.addStudent(students[3]);
		group.addStudent(students[4]);
		group.addStudent(students[5]);
		group.addStudent(students[6]);
		group.addStudent(students[7]);
		group.addStudent(students[8]);
		group.addStudent(student);
		 
		
		group.delStudent(7319);
		group.delStudent(7685);
		System.out.println("Sorted by lastname: ");
		group.sortStudentsByLastname(students);
		System.out.println();
		System.out.println("Just group: ");
	    System.out.println(group.toString());
		System.out.println();
		System.out.println("Search a student: "+group.searchStudent("Molchun"));
		System.out.println("Search a student: "+group.searchStudent("Radchenko"));
	}
}
