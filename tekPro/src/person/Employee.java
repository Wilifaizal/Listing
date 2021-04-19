package person;

public class Employee extends Person {
	private double salary;
	private int year;
	private String insurance;
	
	public Employee(String n, double s, int y, String i){
		super.name = n;
		this.salary = s;
		this.year = y;
		this.insurance = i;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getInsurance() {
		return insurance;
	}
	
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	public boolean equals(Employee e)
	{
		return name.equals(e.name);
	}
	
	public void showEmployee() {
		System.out.println("===== Employee =====");
		System.out.println("Name : "+super.name);
		System.out.println("Salary : " +salary);
		System.out.println("Year : "+year);
		System.out.println("Insurance : "+insurance);
		System.out.println();

	}
	public void showEqualsEmployee(boolean equals) {
		// TODO Auto-generated method stub
		
	}

}
