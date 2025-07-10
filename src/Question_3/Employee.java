package Question_3;

public class Employee {
	String dept; 
	 double salary;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String dept, double salary) {
		super();
		this.dept = dept;
		this.salary = salary;
	}
	
}
