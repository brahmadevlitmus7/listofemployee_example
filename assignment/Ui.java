import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Ui{


	public static void main (String args[]){

	String fileName="employees.txt";

	EmployeeService empService = new EmployeeService();

	List<Employee> listofdata=empService.getAllEmployees(fileName);
	System.out.println(listofdata);
	
	}
	
}