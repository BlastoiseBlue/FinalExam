package problem3;
import java.util.Random;
import java.lang.Math;
public class Driver {
static Student[] generateStudentData(String[] arr) {
	Random r=new Random();
	Student[] s=new Student[arr.length];
	for(int i=0; i<arr.length;i++) {
		s[i].name=arr[i];
		s[i].age=17+r.nextInt(43);
		s[i].gpa=3.1+(double)(r.nextInt(8)/10);
	}
	return s;
}
static void printAll(Student[] arr) {
	for(int i=0; i<arr.length;i++)arr[i].printStudent();
}
	public static void main(String[] args) {
		Student s1=new Student("Emmet",18,3.3);
		s1.printStudent();
		Student s2=new Student();
		s2.printStudent();
		String[] array1={"John","Ben","Steve","Dave","Jake"};
		Student[] a1=generateStudentData(array1);
		printAll(a1);
	}

}
