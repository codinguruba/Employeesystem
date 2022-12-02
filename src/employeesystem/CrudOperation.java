
package employeesystem;


public interface CrudOperation {
    //creating an employee//
    
    public void createEmployee(Employee emp);
    //showing all employee//
    
    public void showAllEmployee();
 
    //update employee//
    
    public void updateEmployee(int id,String name);
    
    //delete Employees
    
    public void  deleteEmployee(int id);
    
    
}
