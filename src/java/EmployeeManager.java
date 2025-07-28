import java.sql.SQLException;


public class EmployeeManager {

    public static void addEmployee(Employee employee) {
        try {
            String sql = "insert into employee(first_name, last_name) values (?, ?)";
            DBUtil.executeLine(sql, employee.getFirstName(), employee.getLastName());
            System.out.println("New Employee added.");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void updateEmployee(int id, String firstName, String lastName) {
        try {
            String sql = "update employee set first_name = ?, last_name = ? where id = ?";
            DBUtil.executeLine(sql, firstName, lastName, id);
            System.out.println("Employee updated.");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void removeEmployee(int id) {
        try {
            String sql = "delete from employee where id = ?";
            DBUtil.executeLine(sql, id);
            System.out.println("Employee removed.");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
