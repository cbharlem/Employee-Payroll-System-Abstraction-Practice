import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static EmployeeManager manager = new EmployeeManager();

    public static void addEmployee(){
        System.out.print("Enter Employee name: ");
        String name = input.nextLine();
        System.out.println("Choose Employee Type: ");
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.print("Enter: ");
        int employeeType = input.nextInt();

        if(employeeType == 1){
            manager.addEmployee(new FullTimeEmployee(name));

        }else if(employeeType == 2){
            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();
            System.out.print("Enter hours to work: ");
            int hoursToWork = input.nextInt();
            manager.addEmployee(new PartTimeEmployee(name, hourlyRate, hoursToWork));
        }else{
            System.out.println("Invalid choice!");
        }
    }

    public static void removeEmployee(){
        System.out.println("Enter employee name: ");
        String name = input.nextLine();
        manager.removeEmployee(name);
    }

    public static void displayInformation(){
        System.out.println("Enter employee name: ");
        String name = input.nextLine();
        manager.displayEmployeeInformation(name);
    }

    public static void displayEmployees(){
        manager.displayEmployees();
    }

    public static void main(String[] args) {
        int choice;

        do {

            System.out.println("Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employee Information");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    displayInformation();
                    break;
                case 4:
                    displayEmployees();
                    break;
                case 5:
                    choice = 5;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again");
                    break;

            }

        }while (choice != 5) ;
    }




    }
