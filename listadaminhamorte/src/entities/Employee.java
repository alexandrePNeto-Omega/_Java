package entities;

public class Employee {
	private Integer  id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		addSalary(salary);
	}
	
	private void addSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(Double percentage) {
		salary += (percentage*salary)/100;		
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

}