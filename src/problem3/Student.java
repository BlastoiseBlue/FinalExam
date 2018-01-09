package problem3;

public class Student {
	public String name;
	public int age;
	public double gpa;

	public Student(String n, int a, double g) {
		name = n;
		age = a;
		gpa = g;
	}
	public Student(Student s){
		name=s.name;
		age=s.age;
		gpa=s.gpa;
	}
	public Student(){
		Student s1=new Student("unknown",-1,-1.0);
		copy(s1);
	}
	public void copy(Student s) {
		this.name=s.name;
		this.age=s.age;
		this.gpa=s.gpa;
	}
	public void printStudent() {
		System.out.println(name+", "+age+", "+gpa);
	}
}
