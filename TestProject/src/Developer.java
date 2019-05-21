
public class Developer {
	private String name;
	private int Age;
	private Long salary;
	
	public Developer(String name,int Age, Long salary){
		
		this.name = name;
		this.Age = Age;
		this.salary =salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	

}
