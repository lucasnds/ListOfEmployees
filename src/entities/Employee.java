package entities;

public class Employee {
	private int id;
	private String name;
	private double Salary;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double Salary) {
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		Salary += Salary * percentage / 100.0;
	}

	@Override
	public String toString() {
		return id + ", " + name + ",  " + Salary;
	}
	
	
	
	
	
	
}
