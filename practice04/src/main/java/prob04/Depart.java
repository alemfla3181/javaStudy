package prob04;

public class Depart extends Employee {
	String department;

	Depart(String name, int salary, String department) {
		setSalary(salary);
		setName(name);
		this.department = department;
	}

	public void getInformation() {
		System.out.println("이름:" + getName() + "  연봉:" + getSalary() + "  부서:" + this.department);
	}

}
