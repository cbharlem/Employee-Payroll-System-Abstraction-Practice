public class PartTimeEmployee extends Employee {

   double hourlyRate;
   int hoursWorked;



PartTimeEmployee(String name, double hourlyRate, int hoursWorked){
super(name);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}

public double calculateSalary(){
    double finalSalary = hourlyRate * hoursWorked;

    return finalSalary;


}



}
