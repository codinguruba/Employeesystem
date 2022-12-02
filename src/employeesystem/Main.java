
package employeesystem;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        Empimp ob=new Empimp();
        System.out.println("Welcome to Employee management application");

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Add Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Update the employee\n" +
                    "4. Delete the employee\n");

            System.out.println("Enter Choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter ID : ");
                     id=sc.nextInt();
                    System.out.println("Enter name ");
                     name=sc.next();
                    System.out.println("Enter Address ");
                     String address=sc.next();
                    System.out.println("Enter Salary");
                    double  salary=sc.nextDouble();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setAddress(address);
                    emp.setSalary(salary);
                    ob.createEmployee(emp);
                    break;
                case 2:
                    ob.showAllEmployee();
                    break;
               
                case 3:
                    System.out.println("Enter id to update the details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name");
                     name=sc.next();
                    ob.updateEmployee(empid1,name);
                    break;
                case 4:
                    System.out.println("Enter the id to delete");
                    id=sc.nextInt();
                    ob.deleteEmployee(id);
                    break;

                case 5:
                    System.out.println("Thank you  !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;


            }

        }while (true);

    }
}