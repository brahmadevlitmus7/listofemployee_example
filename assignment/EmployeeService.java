import java.io.*;
import java.util.ArrayList;
import java.util.List;
class EmployeeService{

	Dao empDao = new Dao();

	public List<Employee> getAllEmployees(String file){
	List<Employee> data=empDao.readfile(file);
	return data; 

	}

}