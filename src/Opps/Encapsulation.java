package Opps;

class Student {
	private String name;
	private int age ;
	private int number;
	
	public long getNumber() {
		
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
	}
  }
}


public class Encapsulation {
		public static void main(String [] args) {
				Student student = new Student();
				student.setName("Kaushal");
				student.setAge(22);
				student.setNumber(989989878);
				
				System.out.println("Name :" + student.getName());
				System.out.println("Age :" + student.getAge());
				System.out.println("Mobile Number :" + student.getNumber());

		}
}
