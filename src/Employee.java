public abstract class Employee {

     String name;


    Employee(String name){
        this.name = name;

    }

    public void displayInfo(){
        System.out.println("Name: " + name + " | " + "Salary: " +  calculateSalary());
    }

    abstract double calculateSalary();

public String toString(){
    return name;
}



}
