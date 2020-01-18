package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private string Name;
	private int employee ID
	private double salary; 
	private double HourlyPayRate; 
	private char gender;
	
	
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	
	public EmployeeInfo () {}

	public EmployeeInfo(String name, int employeeId, String CompanyName, String Name, double salary, double HourlyPayRate, char gender) {
		this.Name= Name;
		this.employeeId= employeeId;
		this.CompanyName= companyName;
    	this.salary = salary;
    	this.gender = gender; 
    	this.HourlyPayRate = HourlyPayRate
    
    	public EmployeeInfo(int employeeId){
    		this.employeeId=employeeId;

    	}
    	public EmployeeInfo(String name, int employeeId){
    		this.name=name;
    		this.employeeId=employeeId;

    	}

    	public EmployeeInfo(String name, int employeeId, String CompanyName, String Name, double salary, double HourlyPayRate, char gender) {
    		this.name = name;
    		this.employeeId = employeeId;
    		this.CompanyName = CompanyName;
    		this.salary = salary;
    		this.gender = gender;
    		this.HourlyPayRate= HourlyPayRate;
    	}

    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

    	public int getEmployeeId() {
    		return employeeId;
    	}

    	public void setEmployeeId(int employeeId) {
    		this.employeeId = employeeId;
    	}

    	@Override
    	public int employeeId() {
    		return employeeId;
    	}

    	@Override
    	public String employeeName() {
    		return null ;
    	

    	@Override
    	public int calculateSalary() {
    		return (int) salary;
    	}

    	@Override
    	public int HourlyPayRate() {
    		System.out.println("Hourly rate is $15.00");
    	}


    	public char getGender() {
    		return gender;
    	}

    	public void setGender(char gender) {
    		this.gender = gender;
    	}

    	public double getSalary() {
    		return salary;
    	}

    	public void setSalary(int salary) {
    		this.salary = salary;
    	}
		

    	
    	
    	
		
	}
    
   
    
   
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
    	public static double calculateEmployeeBonus(int totalNumberOfYears, double AnnualBonus){
    		double annualBonus = 0.00;
    		if (totalNumberOfYears == 10) {
    			AnnualBonus = yearlySalary* 0.2;
    		} else if (totalNumberOfYears == 9 ) {
    			AnnualBonus = yearlySalary * 0.1;
    		} else if (totalNumberOfYears == 8) {
    			AnnualBonus = yearlySalary * 0.09;
    		} else if (totalNumberOfYears == 2) {
    			AnnualBonus = 0;
    			System.out.println("You do not meet standards for bonus");
    		} else {
    			AnnualBonus = 0;
    			System.out.println("You do not meet the standards for a bonus.");
    		}
    		return (int) AnnualBonus;
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeeBonus(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the date joined");
		String enterTheDate = sc.nextLine();
		System.out.println("Enter todays date");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
