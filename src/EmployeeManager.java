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
    public void removeEmployee(String name){
        boolean removed = false;
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getName().equalsIgnoreCase(name)) {
                Employees.remove(i);
                removed = true;
                System.out.println("Employee removed: " + name);
                break;
            }
        }
        if (!removed) {
            System.out.println("Employee not found: " + name);
        }
    }







}
