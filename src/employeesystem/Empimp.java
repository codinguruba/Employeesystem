package employeesystem;

import java.util.*;
import java.sql.*;

public class Empimp implements CrudOperation {

    Connection con;

    @Override
    public void createEmployee(Employee emp) {
        con = DBConnection.createConnection();
        String query = "insert into employee values(?,?,?,?)";
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setInt(1, emp.getId());
            pt.setString(2, emp.getName());
            pt.setString(3, emp.getAddress());
            pt.setDouble(4, emp.getSalary());
            int c = pt.executeUpdate();
            if (c != 0) {
                System.out.println("Employee Inserted Successfull...");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void showAllEmployee() {
        con = DBConnection.createConnection();
        String query = "select * from employee";
        System.out.println("Employee Details:");
        System.out.println("--------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n", "ID", "Name", "Address", "Salary");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.format("%d\t%s\t%s\t%d\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
                System.out.println("----------------------------------------");


            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
  
    @Override
    public void updateEmployee(int id, String name) {
        con = DBConnection.createConnection();
        String query = "update employee set name=? where id=?";
        try {
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, name);
            pt.setInt(2, id);
            int c = pt.executeUpdate();
            if (c != 0) {
                System.out.println("Employee Details updated successfully !!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int id) {
        con = DBConnection.createConnection();
        String query = "delete from employee where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0) {
                System.out.println("Employee Deleted Successfully!!! " + id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
