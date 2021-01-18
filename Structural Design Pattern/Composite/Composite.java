//implementation of composite desgin pattern
import java.util.ArrayList; 
import java.util.List; 

/* every person in a company is an employee , be it manager or developer. If we want to add developers under manager,
we want those developers to be employee as well as manager to be employee. The client must not know the internal structure*/

interface Employee 
{ 
    //show employee details
	public void showEmployeeDetails(); 
} 
//as dev is an employee and has all properties of employee
 class Developer implements Employee 
{ 
	private String name; 
	private long empId; 
	private String position; 

	public Developer(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
				this.position = position; 
	} 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" "+ name+" "+ position); 
	} 
} 
//as manager is also an employee and has all properties of employee
 class Manager implements Employee 
{ 
	private String name; 
	private long empId; 
		private String position; 

	public Manager(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
				this.position = position; 
	} 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" " +name); 
	} 
} 

//as director is an employee and has all properties of employee and can add employees under him (including devlopers and managers)
 class CompanyDirectory implements Employee 
{ 
	private List<Employee> employeeList = new ArrayList<Employee>(); 
	
	@Override
	public void showEmployeeDetails() 
	{ 
		for(Employee emp:employeeList) 
		{ 
			emp.showEmployeeDetails(); 
		} 
	} 
	//adds employees to already present employee list
	public void addEmployee(Employee emp) 
	{ 
		employeeList.add(emp); 
	} 
	//removes employees to already present employee list
	public void removeEmployee(Employee emp) 
	{ 
		employeeList.remove(emp); 
	} 
} 
public class Composite 
{ 
	public static void main (String[] args) 
	{ 
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
		Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
		CompanyDirectory engDirectory = new CompanyDirectory(); 
		engDirectory.addEmployee(dev1); 
		engDirectory.addEmployee(dev2); 
		
		Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
		Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
		
		CompanyDirectory accDirectory = new CompanyDirectory(); 
		accDirectory.addEmployee(man1); 
		accDirectory.addEmployee(man2); 
	
        CompanyDirectory directory = new CompanyDirectory(); 
        //adding all developers and managers in a list
		directory.addEmployee(engDirectory); 
		directory.addEmployee(accDirectory); 
		directory.showEmployeeDetails(); 
	} 
} 
