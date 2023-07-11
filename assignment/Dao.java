import java.io.*;
import java.util.ArrayList;
import java.util.List;

 public class Dao{
	List<Employee> dataList = new ArrayList<Employee>();
	String lineText = null;
	String name;
	String id;

public List<Employee> readfile(String file){
	
 
	try {
    	BufferedReader lineReader = new BufferedReader(new FileReader(file));
    	
 
   	while ((lineText = lineReader.readLine()) != null) {
	String[] splittedDataArray=lineText.split(",",2);
	id=splittedDataArray[0];
	name=splittedDataArray[1];
        
	dataList.add(new Employee(id,name));
    	}
	
    	lineReader.close();
	
	} catch (IOException ex) {
    		System.err.println(ex);
	}
return dataList; 
}


}