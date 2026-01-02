import java.sql.SQLOutput;
import java.util.*;

public class EmployeeManager {
    static ArrayList<Employee> Employees = new ArrayList<>();



EmployeeManager(){
}

public void addEmployee(Employee x){
Employees.add(x);

}

public void displayEmployees(){
    int counter = 1;
    System.out.println("Company Employees: ");
    for(Employee employeeList : Employees){
        System.out.println(counter + ". " + employeeList);
        counter++;
    }



}







}
