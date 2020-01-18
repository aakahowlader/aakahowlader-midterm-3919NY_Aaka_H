package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		

		EmployeeInfo a1 = new EmployeeInfo("name, 101");
		a1.getDept("Howlader");
		a1.farewell(01/01/2010);
		a1.setSalary(5000000.00);
		a1.setEmployeeId(100);
		a1.setGender('F');
		a1.setName("Hunter");

		EmployeeInfo a2 = new EmployeeInfo("Alice", 101, "QA", 60000.00, 'F');
		a2.farewell();
		a2.assignDepartment();
		a2.employeeName();
		a2.calculateSalary();
		a2.annualSalary();
		a2.getGender();

		EmployeeInfo.calculateEmployeePension();
		EmployeeInfo.calculateEmployeeBonus(10, 5000000.00);
		EmployeeInfo.setCompanyName("PNT");


	}

}
