package person;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee("Wili", 200.9, 2020, "8921");
		Employee e2=new Employee("Akbar", 87.2, 2021, "8922");
		
		e1.showEmployee();
		e2.showEmployee(); 
		
		e1.showEqualsEmployee(e1.equals(e2));
	}

}
