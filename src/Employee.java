

import java.util.List;

public class Employee {
	private int empId;
	private Long salary;
	private List<String> email;
	private String department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int empId, Long salary, List<String> email, String department) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.email = email;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", email=" + email + ", department=" + department
				+ "]";
	}
	

}
